#include<iostream>
#include<set>
#include<stdlib.h>
#include<vector>

using namespace std;

int fight(multiset<int>& greenArmy, multiset<int>&blueArmy, int& b);

int main()
{
	int n;
	cin >> n;
	while(n--)
	{
		int b; cin >> b; //number of battlefields
		int sg; cin >> sg; //lemmings in green
		int sb; cin >> sb; //lemmings in blue
		
		multiset<int> greenArmy;
		for(;sg > 0;--sg) 
		{
			int temp; cin >> temp;
			greenArmy.insert(temp);
		}
		
		multiset<int> blueArmy;
		for(;sb > 0;--sb) 
		{
			int temp; cin >> temp;
			blueArmy.insert(temp);
		}
		
		int winner = fight(greenArmy, blueArmy, b);
		
		if(winner == 0)
		{
			cout <<"green and blue died" << endl;
		}
		else if(winner == 1)
		{
			cout << "green wins" << endl;
			for(auto t = greenArmy.rbegin();t != greenArmy.rend(); ++t) 
			{
				cout << *t << endl;
			}
		}
		else if(winner == 2)
		{
			cout << "blue wins" << endl;
			for(auto t = blueArmy.rbegin();t != blueArmy.rend(); ++t) 
			{
				cout << *t << endl;
			}
		}
		if(n!=0)cout << "\n";
	}
	return 0;
}


int fight(multiset<int>& greenArmy, multiset<int>&blueArmy, int& b)
{
	
	b = (greenArmy.size() < b) ? greenArmy.size() : b;	
	b = (blueArmy.size() < b) ? blueArmy.size() : b;	
	
	vector<int> resultsOfBattles(b);
	int battle = 0;
	for(int i = 0; i < b; ++i)
	{
		battle = *(--greenArmy.end()) - *(--blueArmy.end());
		greenArmy.erase(--greenArmy.end());
		blueArmy.erase(--blueArmy.end());
		resultsOfBattles.push_back(battle);
	}
	
	for(int t: resultsOfBattles)
	{
		if(t < 0) blueArmy.insert(abs(t));
		else if(t > 0) greenArmy.insert(t);
	}
	
	if(greenArmy.size() == 0 and blueArmy.size() == 0) return 0;
	else if(greenArmy.size() > 0 and blueArmy.size() == 0) return 1;
	else if(greenArmy.size() == 0 and blueArmy.size() > 0) return 2;
	else return fight(greenArmy, blueArmy, b);
}