#include<iostream>
#include<list>
#include<string>
using namespace std;

void print(const list<char>& v)
{
	for(auto p = v.begin(); p != v.end(); ++p)
	{
		cout << *p;
	}
	cout << endl;
}


int main()
{
	list<char> listOfChars;
	
	string line;
	
	while(getline(cin, line))
	{
		auto index = listOfChars.begin();
		bool isHome = false;
		for(char ch: line)
		{
			if(ch == '[')
			{
				isHome = true;
				index = listOfChars.begin();
			}
			else if(ch == ']') isHome = false;
			else if(isHome)
			{	
				listOfChars.insert(index, ch);
			}
			else listOfChars.push_back(ch);
		}
		print(listOfChars);
		listOfChars.clear();
	}
	return 0;
}