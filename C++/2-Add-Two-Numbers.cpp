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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2){
        ListNode* root=(ListNode*)malloc(sizeof(ListNode));
        root->next=NULL;
        ListNode* q=root;
        ListNode* p=root->next;
    	//ListNode* root=l1;
    	//ListNode* p=root;
        int tmp=0;
        while(l1!=NULL&&l2!=NULL){
        	tmp+=l1->val+l2->val;
        	p=(ListNode*)malloc(sizeof(ListNode));
        	p->val=tmp%10;
        	p->next=NULL;
        	tmp/=10;
        	l1=l1->next;
        	l2=l2->next;
            q->next=p;
            q=p;
        	p=p->next;
        }
        while(l1!=NULL){
        	tmp+=l1->val;
        	p=(ListNode*)malloc(sizeof(ListNode));
        	p->val=tmp%10;
        	p->next=NULL;
        	tmp/=10;
        	l1=l1->next;
            q->next=p;
            q=p;
        	p=p->next;

        }
        while(l2!=NULL){
        	tmp+=l2->val;
        	p=(ListNode*)malloc(sizeof(ListNode));
        	p->val=tmp%10;
        	p->next=NULL;
        	tmp/=10;
        	l2=l2->next;
            q->next=p;
            q=p;
        	p=p->next;
        }
        while(tmp){
        	p=(ListNode*)malloc(sizeof(ListNode));
        	p->val=tmp%10;
        	p->next=NULL;
        	tmp/=10;
            q->next=p;
            q=p;
        	p=p->next;
        }
        free(p);
        //free(q);
        p=NULL;
        return root->next;
    }
};
int main(){
	Solution test=Solution();
    ListNode*l1=(ListNode*)malloc(sizeof(ListNode));
    l1->val=0;
    l1->next=NULL;
    ListNode*l2=(ListNode*)malloc(sizeof(ListNode));
    l2->val=0;
    l2->next=NULL;
    ListNode*head=test.addTwoNumbers(l1,l2);
    while(head!=NULL){
    	cout<<head->val<<endl;
    	head=head->next;
    }
    cout<<"end"<<endl;
	return 0;
}
