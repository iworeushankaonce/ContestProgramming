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
	string word;
	string words[6] = {"HELLO", "HOLA", "HALLO", "BONJOUR" ,"CIAO" ,"ZDRAVSTVUJTE"};
	string lan[6] = {"ENGLISH", "SPANISH", "GERMAN", "FRENCH", "ITALIAN", "RUSSIAN"};
	for(int cas = 0; ; ++cas)
	{
		cin >> word;
		if (word == "#") break;
		
		bool cor = false;
		for(int i = 0; i < 6; ++i)
		{
			if (word == words[i])
			{
				cout << "Case " << (cas + 1) << ": " << lan[i] << endl;
				cor = true;
				break;
			}
		}
		if(!cor)
		{
			cout << "Case " << (cas + 1) << ": " << "UNKNOWN" << endl;
		}
	}
	
	return 0;
}
// g++ -std=c++11 uva12250-Language_Detection.cpp

/*

HELLO
HOLA
HALLO
BONJOUR
CIAO
ZDRAVSTVUJTE
#

Sample Output
Case 1: ENGLISH
Case 2: SPANISH
Case 3: GERMAN
Case 4: FRENCH
Case 5: ITALIAN
Case 6: RUSSIAN
*/