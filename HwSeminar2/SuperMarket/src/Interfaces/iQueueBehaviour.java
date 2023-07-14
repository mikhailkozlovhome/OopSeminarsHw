package Interfaces;

public interface iQueueBehaviour {
    /**
     * Метод реализует логику помещения клиента в очередь
     * 
     * @param actor ссылка на клиента
     */
    void takeInQueue(iActorBehaviuor actor);

    /**
     * Метод реализует логику выхода клиента из очереди
     */
    void releaseFromQueue();

    /**
     * Метод реализует логику формирования заказа
     */
    void takeOrder();

    /**
     * Метод реализует логику получения заказа
     */
    void giveOrder();
}