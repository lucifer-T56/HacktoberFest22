

# takes in the name, phone number and category of a single contact to generate a vcf snippet
def single_vcf(name, phone, categ):
    name_s = name.split()
    details = [name, name_s[-1], name_s[0], " ".join(name_s[1:-1]), phone, categ]

    print(details)

    vcf_format = lambda details : f"BEGIN:VCARD\nVERSION:3.0\nFN:{details[0]}\nN:{details[1]};{details[2]};{details[3]};;\nTEL;TYPE=CELL:{details[4]}\nCATEGORIES:{categ}\nEND:VCARD\n"

    return vcf_format(details)


# takes in a list of names, phone numbers and a category to generate a vcf list
def multiple_vcf(lname, lphone, categ):

    vcf_list = ""
    if len(lname)!=len(lphone):
        print("Invalid inputs (no of names and phone numbers don't match)")
    else:
        for i in range(len(lname)):
            vcf_list += single_vcf(lname[i], lphone[i], categ)
    
    return vcf_list


# this function is used to generate a list of contacts
# it asks for an optional name-prefix (for eg: if prefix is ENCIDE and name is Alnas, the final name would be "(ENCIDE) Alnas") and a category
def create_vcf():
    prefix = input("Enter the name-prefix (ignore if no prefix is required): ")
    if prefix!= "":
        prefix = f'({prefix}) '
    lname, lphone = [],[]
    
    ncontacts = int(input("Enter the number of contacts: "))
    print("Enter the names:")
    for i in range(ncontacts):
        lname.append(prefix+input())
    
    lphone = getPhone(ncontacts)

    categ = input("Enter the category: ")

    lname_lines = "\n".join(lname)
    vcf_lines = multiple_vcf(lname, lphone, categ)
    if vcf_lines == "":
        exit()
    try:    
        fname = input("Enter a filename: ")
        
        vcf_file = open(fname + ".vcf", 'w')
        vcf_file.write(vcf_lines)
        vcf_file.close()

        name_file = open(fname + ".txt", 'w')
        name_file.write(lname_lines)
        name_file.close()
    except : 
        print("Cannot open the file")




def getPhone(nContacts):
    print("Enter the phone numbers: ")
    valid = True
    lphone = []
    for i in range(nContacts):
        phone = input()
        phone = phone.replace(' ', '').replace('-','').replace('+91', '')
        if len(phone) != 10:
            print("Invalid phone number")
            valid = False
        else:
            lphone.append(phone)
    if valid: return lphone
    else: return []
        

create_vcf()