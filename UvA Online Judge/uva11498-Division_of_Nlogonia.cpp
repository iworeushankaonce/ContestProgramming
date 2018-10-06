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
	int k;
	while(cin >> k)
	{
		if (k == 0) break;
		int n; int m;
		cin >> n >> m;
		for (int i = 0; i < k; ++i)
		{
			int x; int y; 
			cin >> x >> y;
			// cout << "            ";
			if (x > n and y > m)
			{
				cout << "NE" << endl;
			}
			else if (x < n and y > m)
			{
				cout << "NO" << endl;
			}
			else if (x < n and y < m)
			{
				cout << "SO" << endl;
			}
			else if (x > n and y < m)
			{
				cout << "SE" << endl;
			}
			else if (x == n)
			{
				cout << "divisa" << endl;
			}
			else if (y == m)
			{
				cout << "divisa" << endl;
			}
		}
	}
	
	
	return 0;
}
// g++ -std=c++11 11498-Division_of_Nlogonia.cpp

/*

3
2 1
10 10
-10 1
0 33
4
-1000 -1000
-1000 -1000
0 0
-2000 -10000
-999 -1001
0
Sample Output
NE
divisa
NO
divisa
NE
SO
SE
*/