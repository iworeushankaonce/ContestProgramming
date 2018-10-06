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
	int cases = 0;
	int n;
	for(int cas = 0; ; ++cas)
	{
		cin >> n;
		if (n == 0) break;
		int c1 = 0;
		int c2 = 0;
		for(int i = 0; i < n; ++i)
		{
			int b;
			cin >> b;
			if (b == 0)
			{
				++c2;
			}
			else 
			{
				++c1;
			}
		}
		cout << "Case " << (cas + 1) << ": " << (c1 - c2) << endl;
		
	}
	
	return 0;
}
// g++ -std=c++11 uva12279-Emoogle_Balance.cpp

/*

5
3 4 0 0 1
4
2 0 0 0
7
1 2 3 4 5 0 0
0

Sample Output
Case 1: 1
Case 2: -2
Case 3: 3
*/