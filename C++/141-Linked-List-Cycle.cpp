#include<windows.h>
#include<iostream>
using namespace std;
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};
 
class Solution {
public:
    bool hasCycle(ListNode *head) {
		if(head==NULL||head->next==NULL)return false;
		ListNode*p=head;
		ListNode*q=head->next->next;
		while(p!=NULL&&q!=NULL){
			if(p==q)return true;
			p=p->next;
			if(q->next!=NULL)q=q->next->next;
			else
				break;
		}
		return false;
    }
};