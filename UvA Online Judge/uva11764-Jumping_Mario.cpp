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
	for(int cas = 0; cas < cases; ++cas)
	{
		int n; cin >> n;
		int a[n];
		for(int i = 0; i< n; ++i)
		{
			cin >> a[i];
		}
		int c1 = 0;
		int c2 = 0;
		for (int i = 1; i < n; ++ i)
		{
			if( a[i - 1] < a[i])
			{
				c1++;
			}
			else if (a[i - 1] > a[i])
			{
				c2++;
			}
		}
		cout << "Case " << (cas + 1) << ": " << c1 << " " << c2 << endl;
	}
	
	return 0;
}
// g++ -std=c++11 uva11764-Jumping_Mario.cpp

/*

3
8
1 4 2 2 3 5 3 4
1
9
5
1 2 3 4 5

Sample Output
Case 1: 4 2
Case 2: 0 0
Case 3: 4 0
*/