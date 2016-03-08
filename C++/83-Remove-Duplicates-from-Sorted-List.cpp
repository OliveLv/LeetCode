//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//For example,
//Given 1->1->2, return 1->2.
//Given 1->1->2->3->3, return 1->2->3.
#include<windows.h>
using namespace std;
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};
 
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if(head==NULL)return head;
		ListNode*p=head;
		ListNode*q=head->next;
		while(q!=NULL){
			if(q->val==p->val){
				p->next=q;
				p=p->next;
			}
			q=q->next;
		}
		return head;
    }
};