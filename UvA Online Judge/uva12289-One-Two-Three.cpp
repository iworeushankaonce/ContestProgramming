#include <iostream>
#include <string>
#include <sstream>
#include <iomanip>
#include <vector>
#include <algorithm>
#include <cctype>

using namespace std;

int main()
{
	int cases; cin >> cases;
	string one = "one";
	string two = "two";
	for(int cas = 0; cas < cases; ++cas)
	{
		string a; cin >> a;
		int l = a.size();
		
		if (l == 3)
		{
			int c1 = 0, c2 = 0;
			for (int i = 0; i < 3; ++i)
			{
				if(a[i] == one[i])
				{
					c1++;
				}
				if(a[i] == two[i])
				{
					c2++;
				}
			}
			if(c1 >= 2)
			{
				cout << "1" << endl;
			}
			else
			// if(c2 == 2)
			{
				cout << "2" << endl;
			}
		}
		else
		{
			cout << "3" << endl;
		}
	}
	
	return 0;
}
/* g++ -std=c++11 uva12289-One-Two-Three.cpp

3
owe
too
theee

Sample Output
1
2
3
*/