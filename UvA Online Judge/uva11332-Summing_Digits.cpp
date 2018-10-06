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
	int n;
	while(cin >> n)
	{
		if(n == 0) break;
		int l = to_string(n).size();
		int sum = 0;
		while(l != 1)
		{
			sum = 0;
			// cout << "len = " << l << endl;
			for (int i = 0; i < l; ++i)
			{
				int a = n % 10;
				n /= 10;
				sum += a;
				// cout << "i = " << i << " sum = " << sum << endl;
			}
			n = sum;
			l = to_string(sum).size();
		}
		cout << n << endl;
	}
	
	
	return 0;
}
// g++ -std=c++11 11332-Summing_Digits.cpp

/*

2
11
47
1234567892
0
Sample Output
2
2
2
2
*/