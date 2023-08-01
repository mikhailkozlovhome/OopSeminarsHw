package Calculator.Controller;

import Calculator.Model.Arg;

public interface iCalculable {
    iCalculable sum(Arg arg);

    iCalculable multi(Arg arg);

    iCalculable div(Arg arg);

    Arg getResult();
}
