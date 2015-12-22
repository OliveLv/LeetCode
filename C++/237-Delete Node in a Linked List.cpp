#include<windows.h>
using namespace std;
// to deal with identifier 'NULL' is undefined
struct ListNode {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
};
 
//class Solution {
//public:
//    void deleteNode(ListNode* node) {
//		ListNode * p=node->next;
//		while(p!=NULL){
//			node->val=p->val;
//			p=p->next;
//			if(p==NULL)break;
//			node=node->next;
//		}
//		node->next=NULL;
//
//    }
//};

//class Solution {
//public:
//    void deleteNode(ListNode* node) {
//		ListNode* p=node->next;
//		if(p!=NULL){
//		node->val=p->val;
//		node->next=p->next;
//		}
//		free(p);
//		
//
//    }
//};

//class Solution {
//public:
//    void deleteNode(ListNode* node) {
//		ListNode* p=node->next;
//		node->val=p->val;
//		node->next=p->next;
//    }
//};
class Solution {
public:
    void deleteNode(ListNode* node) {
		*(node)=*(node->next);
		

    }
};