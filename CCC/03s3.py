def floodfill(row, col):
    if row<0 or col<0 or row >=R or col>= C:
        return 0
    if floor[row][col] == "I":
        return 0
    floor[row][col] = "I"
    count = 1
    count = count+floodfill(row+1, col)
    count = count+floodfill(row-1, col)
    count = count+floodfill(row, col+1)
    count = count+floodfill(row, col-1)
    return count
 
sqm = int(input())
R = int(input())
C = int(input())
 
floor = []
for m in range(R):
    onerow = [x for x in input()]
    floor.append(onerow)
 
room = []
for x in range(R):
    for y in range(C):
        if floor[x][y] == '.':
            room.append(floodfill(x, y))
 
 
room.sort(reverse=True)

count = 0
numOfRooms = 0
for x in range(len(room)):
    if count+room[x] <= sqm:  
        count = count+room[x]
        numOfRooms += 1
    else:
        break
 
if numOfRooms == 1:
    print(str(numOfRooms)+" room, "+ str(sqm-count) +" square metre(s) left over")
else:
    print(str(numOfRooms)+" rooms, "+ str(sqm-count) +" square metre(s) left over")
