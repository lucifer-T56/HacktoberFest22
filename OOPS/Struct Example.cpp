#include<iostream>
#include<string>
using namespace std;

struct inventoryitem
{
	string code;
	string name;
	double cost;
	double sellingprice;
};

void displaystock(int& m, inventoryitem* a)
{
	for (int i = 0; i < m; i++)
	{
		cout << "ITEM " << i + 1 << endl;
		cout << "Name : " << a[i].name << endl;
		cout << "Code : " << a[i].code << endl;
		cout << "Cost : " << a[i].cost << endl;
		cout << "Selling Price : " << a[i].sellingprice << endl;
		cout << endl;
	}
}

inventoryitem insertitem()
{
	inventoryitem a;

	cout << "enter the name of item  : ";
	cin >> a.name;

	cout << "enter the cost of item  : ";
	cin >> a.cost;

	// Selling Price ( selling price should be computed on the basis of
	// 40% profit on cost. )

	a.sellingprice = 0.4 * a.cost;

	//  Item code ( To generate an item code, you should combine the first 
	//  three characters of the item name(in upper case) with a running integer,
	//  both separated with an underscore)

	//convert to string
	a.code = a.name.substr(0, 3);

	for (int g = 0; g < 3; g++)
	{
		if ((a.code[g] >= 'a') && (a.code[g] <= 'z'))
			a.code[g] -= 32;
	}
	a.code += '_';

	static const char s[] = "0123456789";
	for (int j = 0; j < 5; j++)
		a.code += s[rand() % sizeof(s) - 1];

	return a;
}
int main()
{
	cout << "How many item you want to enter: ";
	int item;
	cin >> item;

	inventoryitem* a = new inventoryitem[item];
	for (int i = 0; i < item; i++)
	{
		cout << "Enter data for item no " << i + 1 << ":" << endl;
		a[i] = insertitem();
	}

	displaystock(item, a);     // Function to display item's data(Name, Cost, Selling Price, Item Code)
	return 0;
}