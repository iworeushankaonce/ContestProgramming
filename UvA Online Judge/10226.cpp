#include<iostream>
#include<map>
#include<string>
#include<iomanip>
using namespace std;

int main()
{
	int t;
	cin >> t;
	map<string, int> mymap;
	cin.ignore();
	for(int q = 0; q < t; ++q)
	{
		string str;
		int counter = 0;
		while(getline(cin, str))
		{
			if(str.length() == 0 or (int)str[0] == 10) break;
			++mymap[str];
			++counter;
		}
		
		double percent = 100 / (double)counter;
		
		for(auto i = mymap.begin(); i != mymap.end(); ++i)
		{
			double size =  i->second * percent;
			cout << i->first << " "  << setprecision (4)<< fixed << size << endl;
		}
		if(q != t-1)cout << endl;
		mymap.clear();
	}
	return 0;
}