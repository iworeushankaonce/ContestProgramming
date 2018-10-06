#include<iostream>
#include<set>
#include<string>
#include<cctype>

using namespace std;

void print(set<string>& dictionary);

int main()
{                                 
	char ch;
	string word;
	set<string> dictionary;
	bool isHyphenChar = false;
	
	while(cin.get(ch))
	{
		if(isalpha(ch))
		{
			word += (islower(ch)) ? ch : tolower(ch);
			isHyphenChar = false;
		}
		else if(ch == '-')
		{
			isHyphenChar = true;
			word += '-';
		}
		else if((int)ch == 10 and isHyphenChar)
		{
			word.pop_back();
			isHyphenChar = false;
		}
		else
		{
			if(word != "")dictionary.insert(word);
			word.clear();
		}
		
	}
	print(dictionary);
return 0;
}

void print(set<string>& dictionary)
{
	for(auto it = dictionary.begin(); it != dictionary.end(); ++it) 
	{
		cout << *it << endl;
	}
}