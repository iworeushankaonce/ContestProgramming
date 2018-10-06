#include <iostream>
#include <algorithm>
#include <ctype.h>
#include <unordered_map>

using namespace std;

int main ()
{
	string a, b;
    int n;
	getline(cin, a);
	n = stoi(a);
	unordered_map <string, string> m;
    for (int i = 0; i < n; i++)
    {
		getline (cin, a);
		getline (cin, b);
		m.insert(make_pair(a, b));
    }

	getline(cin, a);
	n = stoi(a);
	for (int i = 0; i < n; i ++)
	{
		string x;
		getline(cin, x);
		cout << m.find(x)->second << endl;
	}
	
	return 0;
}
