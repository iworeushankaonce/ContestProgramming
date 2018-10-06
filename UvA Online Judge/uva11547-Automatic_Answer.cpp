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
		n *= 567;
		n /= 9;
		n += 7492;
		n *= 235;
		n /= 47;
		n -= 498;
		n /= 10;
		int r = abs(n % 10);
		cout << r << endl;
	}
	
	return 0;
}
// g++ -std=c++11 11547-Automatic_Answer.cpp

/*

2
637
-120

Sample Output
1
3
*/