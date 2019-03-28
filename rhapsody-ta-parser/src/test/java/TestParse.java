import java.io.File;
import java.io.FileReader;
import java.io.PushbackReader;

import org.openflexo.ta.rhapsody.parser.lexer.Lexer;
import org.openflexo.ta.rhapsody.parser.node.Start;
import org.openflexo.ta.rhapsody.parser.parser.Parser;

public class TestParse {

	public static void main(String[] args) {

		try {
			// System.out.println("Parsing: " + anExpression);

			File f = new File("/Users/sylvain/GIT-2.0.0/openflexo-rhapsody/rhapsody-ta-parser/src/test/resources/Default.sbs");
			// File f = new File("/Users/sylvain/GIT-2.0.0/openflexo-rhapsody/rhapsody-ta-parser/src/test/resources/DefaultComponent.cmp");
			// File f = new File("/Users/sylvain/GIT-2.0.0/openflexo-rhapsody/rhapsody-ta-parser/src/test/resources/PingPongProject.rpy");
			// File f = new File("/Users/sylvain/GIT-2.0.0/openflexo-rhapsody/rhapsody-ta-parser/src/test/resources/PingPongProject2.rpy");

			System.out.println("parsing " + f);

			// Create a Parser instance.
			Parser p = new Parser(new Lexer(new PushbackReader(new FileReader(f))));

			// Parse the input.
			Start tree = p.parse();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
