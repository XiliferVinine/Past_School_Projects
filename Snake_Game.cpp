#include <iostream>
#include <conio.h>
using namespace std;
void rungame();
void printmap();
void initializemap();
void move(int hx, int hy);
void changedirection(char key);
void addfood();
void snakeSizeChange();
void cleargameboard();
void sleep(unsigned seconds);
char getMapValue(int value);
//dimensions
const int widthOfMap = 20;
const int heightOfMap = 20;
const int mapSize = widthOfMap * heightOfMap;
int map[mapSize];
//Snake
int headxaxis;
int headyaxis;
int direction;
int foodAte = 3;
bool running;
int main() {
	rungame();
	return 0;
};
void printmap() {
	for (int x = 0; x < widthOfMap; ++x) {
		for (int y = 0; y < heightOfMap; ++y) {
			cout << getMapValue(map[x + y * widthOfMap]);
		}
		cout << endl;
	}
};
void rungame() {
	initializemap();
	running = true;
	while (running) {
		if (_kbhit()) {
			changedirection(_getch());
		}
		snakeSizeChange();
		cleargameboard();
		printmap();
	}
	cout << "\t\t!!!Game Over!" << endl;
	cout << "\t\tYour Final Score Is: " << foodAte << endl;
	cin.ignore();
	system("pause");
};
void cleargameboard() {
	system("cls");
};
void changedirection(char key) {
	/*
		w
	a	+	d
		s
		1
	4	+	2
		3
	*/
	switch (key) {
	case 'w':
		if (direction != 2) {
			direction = 0;
			break;
		}
	case 'd':
		if (direction != 3) {
			direction = 1;
			break;
		}
	case 's':
		if (direction != 4) {
			direction = 2;
			break;
		}
	case 'a':
		if (direction != 5) {
			direction = 3;
			break;
		}
	}
};
void move(int hx, int hy) {
	int newx = headxaxis + hx;
	int newy = headyaxis + hy;
	if (map[newx + newy * widthOfMap] == -2) {
		foodAte++;
		addfood();
	}
	else if (map[newx + newy * widthOfMap] != 0) {
		running = false;
	}
	headxaxis = newx;
	headyaxis = newy;
	map[headxaxis + headyaxis * widthOfMap] = foodAte + 1;
};
void initializemap() {
	headxaxis = widthOfMap / 2;
	headyaxis = heightOfMap / 2;
	map[headxaxis + headyaxis * widthOfMap] = 1;
	for (int x = 0; x < widthOfMap; ++x) {
		map[x] = -1;
		map[x + (heightOfMap - 1) * widthOfMap] = -1;
	}
	for (int y = 0; y < heightOfMap; ++y) {
		map[0 + y * widthOfMap] = -1;
		map[(widthOfMap - 1) + y * widthOfMap] = -1;
	}
	addfood();
};
void addfood() {
	int x = 0;
	int y = 0;
	do {
		x = rand() % (widthOfMap - 2) + 1;
		y = rand() % (heightOfMap - 2) + 1;
	} while (map[x + y * widthOfMap] != 0);
	map[x + y * widthOfMap] = -2;
};
void snakeSizeChange() {
	switch (direction) {
	case 1: move(-1, 0);
		break;
	case 2: move(0, 1);
		break;
	case 3: move(1, 0);
		break;
	case 4: move(0, -1);
		break;
	}
	for (int i = 0; i < mapSize; i++) {
		if (map[i] > 0) map[i]--;
	}
};
char getMapValue(int value) {
	
	if (value > 0) {
		return 'o';
	}
	switch (value) {
	case -1:
		return 'X';
	case -2:
		return 'O';
	}
};
