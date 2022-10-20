var temp=document.getElementById("share_snck16_success").nextElementSibling.text;
temp=temp.replace(/if.*\n.*\n.*\n.*\n.*/,"")
temp=temp.replace(/encodeURIComponent/g,"")
temp=temp.replace(/\(/g,"")
temp=temp.replace(/\)/g,"")

eval(temp);
var ques= {
    id: submission_id,
    qurl: "https://www.codechef.com"+problem_url,
    qname: problem_name
}
//alert(ques.qurl);
chrome.runtime.sendMessage({entry: ques});
