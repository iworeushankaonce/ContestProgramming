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
		long long sum = 0;
		int n;
		cin >> n;
		for(int i = 0; i < n; ++i)
		{
			int a = 0, b = 0,c = 0;
			cin >> a >> b >> c;
			sum += (long long)(a * c);
		}
		cout << sum << endl;
	}
	
	return 0;
}
// g++ -std=c++11 10300-Ecological_Premium.cpp

/*

3
5
1 1 1
2 2 2
3 3 3
2 3 4
8 9 2
3
9 1 8
6 12 1
8 1 1
3
10 30 40
9 8 5
100 1000 70
Sample Output
38
86
7445

*/