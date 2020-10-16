#include<iostream>
using namespace std;
class Node
{
	public:
		int data;
		Node* right;
		Node* left;
		Node()
		{
			right=NULL;
			left=NULL;
		}
		Node(int k)
		{
			data=k;
			right=NULL;
			left=NULL;
		}
};
int main()
{
	Node* root = new Node(5);
	root->right = new Node(10);
	root->left = new Node(6);
	root->right->right = new Node(2);
	return 0;
}

