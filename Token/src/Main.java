
import java.util.Arrays;

enum TokenType {
	TOKEN_IDENTIFIER, TOKEN_KEYWORD, TOKEN_OPERATION, TOKEN_INTEGER_LITERAL, TOKEN_ERROR
}

class Token {
	TokenType type;
	String lexeme;

	Token(TokenType type, String lexeme) {
		this.type = type;
		this.lexeme = lexeme;
	}
}

public class Main {
	public static boolean isKeyword(String word) {
		String[] keywords = { "int", "float", "if", "else", "while", "for", "return" };
		return Arrays.asList(keywords).contains(word);
	}

	public static Token[] tokenize(String input) {
		String[] tokensArray = input.split("\\s+"); // Split input into tokens using whitespace as separator
		Token[] tokens = new Token[tokensArray.length];
		int tokenCount = 0;

		for (String tokenString : tokensArray) {
			if (tokenString.matches("^[a-zA-Z_][a-zA-Z0-9_]*")) {
				if (isKeyword(tokenString)) {
					tokens[tokenCount] = new Token(TokenType.TOKEN_KEYWORD, tokenString);
				} else {
					tokens[tokenCount] = new Token(TokenType.TOKEN_IDENTIFIER, tokenString);
				}
			} else if (tokenString.matches("[-+*/=<>]+")) {
				tokens[tokenCount] = new Token(TokenType.TOKEN_OPERATION, tokenString);
			} else if (tokenString.matches("\\d+|\\d*\\.\\d+")) {
				tokens[tokenCount] = new Token(TokenType.TOKEN_INTEGER_LITERAL, tokenString);
			} else {
				tokens[tokenCount] = new Token(TokenType.TOKEN_ERROR, tokenString);
			}
			tokenCount++;
		}

		return Arrays.copyOf(tokens, tokenCount); // Trim the array to the actual number of tokens
	}

	public static void main(String[] args) {
		String input = "int main() { return 0; }";
		Token[] tokens = tokenize(input);

		for (Token token : tokens) {
			System.out.println("Token Type: " + token.type + ", Lexeme: " + token.lexeme);
		}
	}
}