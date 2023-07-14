package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    /**
     * Метод выполняет возврат товара
     */
    public void returnOrder();

    /**
     * Метод определяет может ли клиент выполнять возврат товара
     * 
     * @return возращает признак возможности возврата заказа
     */
    public boolean isReturnable();

    /**
     * Метод возвращает ссылку на клиента
     * 
     * @return ссылка на клиента
     */
    Actor getActor();
}
