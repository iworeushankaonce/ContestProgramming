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
		int max = 0;
		for (int i = 0; i < n; ++ i)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		cout << "Case " << (cas + 1) << ": " << max << endl;
	}
	
	return 0;
}
// g++ -std=c++11 uva11799-Horror_Dash.cpp

/*

2
5 9 3 5 2 6
1 2
Sample Output
Case 1: 9
Case 2: 2
*/