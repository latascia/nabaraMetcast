package console_input_runner;


import org.junit.Before;
import org.junit.Test;
import request.Request;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ConsoleInputHandlerTest {
    private ConsoleInputGetter inputReader;

    @Before
    public void createHandler() {
        inputReader = mock(ConsoleInputGetter.class);
        }

    @Test
    public void testIfHandlerAsksInputGetterForRequest() {
        Request damnRequest = new Request("test", "test");
        when(inputReader.getRequestFromConsole()).thenReturn(damnRequest);
        ConsoleDataHandler
                handler = new ConsoleDataHandler(inputReader);
        verify(inputReader).getRequestFromConsole();
    }

}
