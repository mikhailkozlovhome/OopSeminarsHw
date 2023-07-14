package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * Метод реализует логику входа клиента в магазин
     * @param actor ссылка на клиента
     */
    void acceptToMarket(iActorBehaviuor actor);
    /**
     * Метод реализует логику выхода клиента из магазина
     * @param actor ссылка на клиента
     */
    void releaseFromMarket(List<Actor> actor);

    /**
     * Метод реализует логику нахождения клиента в магазине
     */
    void update();
}