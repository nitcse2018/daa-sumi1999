 /*GREEDY METHOD :
  C++ Program to solve Knapsack problem using Greedy method */

/* INPUT :
   Items as (value, weight) pairs
   arr[] = {{60, 10}, {100, 20}, {120, 30}}
   Knapsack Capacity, W = 50; 
   OUTPUT :
   Maximum possible value = 240
   By taking full items of 10 kg, 20 kg and 
   2/3rd of last item of 30 kg */  

#include <bits/stdc++.h>   
using namespace std; 

struct Item 
{ 
    int value, weight;    
    Item(int value, int weight) : value(value), weight(weight) 
    {} 
}; 
  
// Comparison function to sort Item according to val/weight ratio 
bool cmp(struct Item a, struct Item b) 
{ 
    double r1 = (double)a.value / a.weight; 
    double r2 = (double)b.value / b.weight; 
    return r1 > r2; 
} 

double fractionalKnapsack(int W, struct Item arr[], int n) 
{ 
    sort(arr, arr + n, cmp);   
    int curWeight = 0;  // Current weight in knapsack 
    double finalvalue = 0.0; // Result (value in Knapsack) 
    for (int i = 0; i < n; i++) 
    {  
        if (curWeight + arr[i].weight <= W) 
        { 
            curWeight += arr[i].weight; 
            finalvalue += arr[i].value; 
        }  
        else
        { 
            int remain = W - curWeight; 
            finalvalue += arr[i].value * ((double) remain / arr[i].weight); 
            break; 
        } 
    } 
    return finalvalue; 
} 

int main() 
{ 
    int W = 50;   //    Weight of knapsack 
    Item arr[] = {{60, 10}, {100, 20}, {120, 30}};   
    int n = sizeof(arr) / sizeof(arr[0]); 
    cout << "Maximum value we can obtain = "<< fractionalKnapsack(W, arr, n); 
    return 0; 
} 