#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>

char stack[100]; 
int top=-1;

void push(char item){
    stack[++top]=item;
}

char pop(){
    return stack[top--];
}

int precedence(char ch){
    if(ch == '^') 
        return 3;
    else if(ch=='*' || ch=='/')
        return 2;
    else if(ch=='+' || ch=='-')
        return 1;
    
    return -1;
}

void InfixToPostfix(char* exp){
    for(int i=0;exp[i]!='\0';i++){
        char c=exp[i];
        if(isalnum(c))
            printf("%c",c);
        else if(c=='(')
            push(c);
        else if(c==')'){
            while(top!=-1 && stack[top]!='(')
                printf("%c",pop());
            pop();
        }
        else{
            while(top!=-1 && precedence(stack[top])>=precedence(c))
                printf("%c",pop());
            push(c);
        }
    }
    while(top!=-1)
        printf("%c",pop());
}

void main(){
    char exp[]="A+B-C*(D/E)-F";
    printf("Infix: %s\n", exp);
    printf("Postfix: ");
    InfixToPostfix(exp);
}