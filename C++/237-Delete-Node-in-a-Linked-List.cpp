#include<iostream>
#include<stdlib.h>
using namespace std;
// Definition for singly-linked list.
 struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
 };

class Solution {
public:
    void deleteNode(ListNode* node) {
		ListNode* p=node->next;
	    while(true){
			node->val=p->val;
			if(p->next==NULL)break;
			node=node->next;
			p=p->next;
	    }
		node->next=NULL;
    }
};
	int main(){
		ListNode*list=(ListNode*)malloc(sizeof(ListNode));
		list->val=1;
		ListNode* p=list;
		p->next=(ListNode*)malloc(sizeof(ListNode));
		p=p->next;
		p->val=2;
		p->next=(ListNode*)malloc(sizeof(ListNode));
		p=p->next;
		p->val=3;
		ListNode* node=p;
		p->next=(ListNode*)malloc(sizeof(ListNode));
		p=p->next;
		p->val=4;
		p->next=NULL;
		/*while(list!=NULL){
		  cout<<list->val<<endl;
		  list=list->next;
	    }*/
		Solution test=Solution();
		test.deleteNode(node);
	    while(list!=NULL){
		  cout<<list->val<<endl;
		  list=list->next;
	    }
	return 0;
	}
