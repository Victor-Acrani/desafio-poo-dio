package br.com.acrani.interfaces;

import br.com.acrani.models.Bootcamp;

public interface IDeveloper {

    void subscribeBootcamp(Bootcamp bootcamp);
    void progress();
    void calculateXP();
}
