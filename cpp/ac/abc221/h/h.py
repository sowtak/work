f=lambda:map(int,input().split())
r,c=f()
x,y=f()
d,l=f()
p=lambda a:a and a[0]*p(a[1:])or 1
C=lambda n,r:[p(range(n-r+1,n+1))//p(range(1,r+1)),0][n<r]
s=d+l
print((r-x+1)*(c-y+1)*C(s,d)*[sum(C((x-g//3)*(y-g%3),s)*[1,-2,4][g%2-(g==4)]for g in range(9)),1][x==y==1]%1000000007)
