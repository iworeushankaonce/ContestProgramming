#include<iostream>
#include<vector>
#include<string>

using namespace std;

int main()
{
	
	for (;;)
	{
		vector<string> dealer;
		vector<string> nondealer;
		vector<string> table;
		
		string card; 
		cin >> card;
		if(card == "#"){
			break
		}
		
		for(int i = 1;i<26;++i){
			cin >> card;
			nondealer.push_back(card);
			
			cin >> card;
			dealer.push_back(card);
		}
		
		for()
		
	}		
	return 0;
}