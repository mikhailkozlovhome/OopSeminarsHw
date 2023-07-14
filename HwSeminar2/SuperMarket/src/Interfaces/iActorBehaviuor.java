package Interfaces;

import Classes.Actor;

public interface iActorBehaviuor {
    /**
     * Метод возвращает признак получения заказа
     * 
     * @return значение признака
     */
    public boolean isTakeOrder();

    /**
     * Метод возвращает признак формирования заказа
     * 
     * @return значение признака
     */
    public boolean isMakeOrder();

    /**
     * Метод устанавливает признак получения заказа
     * 
     * @param takeOrder значение признака
     */
    public void setTakeOrder(boolean takeOrder);

    /**
     * Метод устанавливает признак формирования заказа
     * 
     * @param makeOrder значение признака
     */
    public void setMakeOrder(boolean makeOrder);

    /**
     * Метод возвращает ссылку на клиента
     * 
     * @return значение ссылки
     */
    Actor getActor();

}
