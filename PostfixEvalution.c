#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int stack[100];
int top=-1;

void push(int item){
    stack[++top]=item;
}

int pop(){
    return stack[top--];
}

int evaluatePostfix(char* exp){
    for(int i=0; exp[i] != '\0'; i++){
        char ch=exp[i];
        if(isdigit(ch))
            push(ch - '0');
        else if(ch == ' ')
            continue;
        else{
            int val1=pop();
            int val2=pop();

            switch (ch) {
                case '+': push(val2 + val1); break;
                case '-': push(val2 - val1); break;
                case '*': push(val2 * val1); break;
                case '/': push(val2 / val1); break;
            }
        }
    }
    return pop();
}
void main(){
    char exp[]="52+384/*-6-";
    printf("Postfix Evaluation: %d\n", evaluatePostfix(exp));

}
