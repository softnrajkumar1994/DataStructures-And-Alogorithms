def swapAsc(list1,length1):
    for i in range(0,int(length1)):
        for j in range(0,int(length1)-1):
            if list1[j] > list1[j+1]:
                temp=list1[j]
                list1[j]=list1[j+1]
                list1[j+1]=temp
    print("The Ascending order is " + str(list1))

def swapDsc(list1,length1):
    for i in range(0,int(length1)):
        for j in range(0,int(length1)-1):
            if list1[j] < list1[j+1]:
                temp=list1[j]
                list1[j]=list1[j+1]
                list1[j+1]=temp
    print("The Descending order is " + str(list1))


list1 = []
length1=input("Enter the number of occurence ")
for i in range(0,int(length1)):
    element=input("Enter " + str(i+1) + "  element ")
    list1.append(int(element))
swapAsc(list1,length1)
swapDsc(list1,length1)


