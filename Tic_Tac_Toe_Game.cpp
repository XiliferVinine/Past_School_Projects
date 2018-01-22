#include <iostream>
using namespace std;
	char square[10]{
		'0','1','2','3','4','5','6','7','8','9'
	};
	int checkforwin();
	void board();
	int main() {
		int player = 1, i, choice;
		char marking;
		do {
			board();
			player = (player % 2) ? 1 : 2;
			cout << "Player " << player << " Enter a number: ";
			cin >> choice;
			marking = (player == 1) ? 'X' : 'O';
			if (choice == 1 && square[1] == '1') {
				square[1] = marking;
			}
			else if (choice == 2 && square[2] == '2') {
				square[2] = marking;
			}
			else if (choice == 3 && square[3] == '3') {
				square[3] = marking;
			}
			else if (choice == 4 && square[4] == '4') {
				square[4] = marking;
			}
			else if (choice == 5 && square[5] == '5') {
				square[5] = marking;
			}
			else if (choice == 6 && square[6] == '6') {
				square[6] = marking;
			}
			else if (choice == 7 && square[7] == '7') {
				square[7] = marking;
			}
			else if (choice == 8 && square[8] == '8') {
				square[8] = marking;
			}
			else if (choice == 9 && square[9] == '9') {
				square[9] = marking;
			}
			else {
				cout << "Invalid Move ";
				player--;
				cin.ignore();
				cin.get();
			}
			i = checkforwin();
			player++;
		} while (i == 2); {
			board();
			if (i == 1) {
				cout << "==> Player " << --player << " Wins!" << endl;
			}
			else {
				cout << "==> The Game is a Draw" << endl;
			}
			cin.ignore();
			cin.get();
			return 0;
		}
	}
	int checkforwin() {
		if (square[1] == square[2] && square[2] == square[3]) {
			return 1;
		}
		else if (square[4] == square[5] && square[5] == square[6]) {
			return 1;
		}
		else if (square[7] == square[8] && square[8] == square[9]) {
			return 1;
		}
		else if (square[1] == square[4] && square[4] == square[7]) {
			return 1;
		}
		else if (square[2] == square[5] && square[5] == square[8]) {
			return 1;
		}
		else if (square[3] == square[6] && square[6] == square[9]) {
			return 1;
		}
		else if (square[1] == square[5] && square[5] == square[9]) {
			return 1;
		}
		else if (square[3] == square[5] && square[5] == square[7]) {
			return 1;
		}
		else if (square[1] != '1' && square[2] != '2' && square[3] != '3' && square[4] != '4' && square[5] != '5' && square[6] != '6' && square[7] != '7' && square[8] != '8' && square[9] != '9') {
			return 0;
		}
		else {
			return 2;
		}
	}
	void board() {
		system("cls");
		cout << "\n\n Tic Tac Toe \n\n" << endl;
		cout << "Player 1 (X)  -  Player 2 (O)" << endl;
		cout << endl;
		cout << "     |     |     " << endl;
		cout << "  " << square[1] << "  |  " << square[2] << "  |  " << square[3] << endl;
		cout << "_____|_____|_____" << endl;
		cout << "     |     |     " << endl;
		cout << "  " << square[4] << "  |  " << square[5] << "  |  " << square[6] << endl;
		cout << "_____|_____|_____" << endl;
		cout << "     |     |     " << endl;
		cout << "  " << square[7] << "  |  " << square[8] << "  |  " << square[9] << endl;
		cout << "     |     |     " << endl;
	}
