#include <bits/stdc++.h>
#include <unordered_map>

using namespace std;

int main ()
{
	int n;	cin >> n;
	for (int i = 0; i < n; i++)
	{
		int a;	cin >> a;
		unordered_map<string, int> m;
		string text; 
		int x;
		for (int j = 0; j < a; j++)
		{
			cin >> text >> x;
			m.insert(make_pair(text, x));
		}
		cin >> a;
		cin >> text;
		if (m.find(text) == m.end())
			cout << "Case " << (i + 1) << ": Do your own homework!" << endl;
		else if (m.find(text) -> second <= a)
			cout << "Case " << (i + 1) << ": Yesss" << endl;
		else if (m.find(text) -> second <= (a + 5))
			cout << "Case " << (i + 1) << ": Late" << endl;
		else 
			cout << "Case " << (i + 1) << ": Do your own homework!" << endl;
	}
	
	return 0;
}