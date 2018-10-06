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
		vector <int> a;
		for(int i = 0; i< n; ++i)
		{
			int b; cin >> b;
			a.push_back(b);
		}
		auto mi = min_element(a.begin(), a.end());
		auto ma = max_element(a.begin(), a.end());
		int r = 2 * (*ma - *mi);
		cout << r << endl;
	}
	
	return 0;
}
// g++ -std=c++11 11364-Parking.cpp

/*

2
4
24 13 89 37
6
7 30 41 14 39 42

Sample Output
152
70
*/