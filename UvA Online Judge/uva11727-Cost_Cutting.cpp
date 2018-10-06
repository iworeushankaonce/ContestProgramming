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
		int a = 0; int b = 0; int c = 0;
		cin >> a >> b >> c;
		vector<int> v;
		v.push_back(a);
		v.push_back(b);
		v.push_back(c);
		sort(v.begin(), v.end());
		cout << "Case " << (cas + 1) << ": " << v[1] << endl;
		
	}
	
	return 0;
}
// g++ -std=c++11 uva11727-Cost_Cutting.cpp

/*

3
1000 2000 3000
3000 2500 1500
1500 1200 1800

Sample Output
Case 1: 2000
Case 2: 2500
Case 3: 1500
*/