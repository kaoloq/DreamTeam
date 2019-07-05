# DreamTeam
Команда:
      
      Кушкоева Анастасия
      Давкаева Валентина 
      Судакова Полина

## Спецификация программы поразрядной сортировки RadixSort
  
**Постановка задачи**
 
 Программа должна выполнять сортировку элементов типа int и String поразрядным методом и осуществлять визуализацию работы данного алгоритма. Она должна обладать графическим интерфейсом пользователя (GUI) с возможностью ручного ввода элементов для сортировки.
***
**Описание алгоритма и структуры данных**

 Предназначен для сортировки целых чисел, записанных цифрами, и строк, являющихся набором символов. 

    · элементы перебираются по порядку и группируются по самому младшему разряду;
           · Возникает новая последовательность.
    ·  Затем группируются по следующему разряду с конца, затем по следующему и т.д. пока не будут перебраны все разряды, от младших к старшим.
***
  Данная программа будет состоять из двух базовых классов:
 
    · класс, отвечающий за GUI и обеспечивающий работу основной логики программы;
    · класс, реализующий разработку алгоритма поразрядной сортировки.
***   
 Основная структура данных - массив.
 
***  
**Формат входных и выходных данных**

   Входные данные:
   
      вручную: в окошке для ввода пользователь вписывает через пробел элементы данных для сортировки; 
      с файла: срабатывает при нажатии на кнопку "Ввод с файла";
      генерируется программой.
            
   Выходные данные:      
   
      результат работы программы заносятся в файл и на экран как отсортированный массив элементов данных.

## Примерный вариант GUI
 ![Иллюстрация к проекту](https://github.com/kaoloq/DreamTeam/blob/master/%D0%BF%D1%80%D0%BE%D1%82%D0%BE%D1%82%D0%B8%D0%BF.png)
 
      
## План разработки

1. Создание прототипа: к этому шагу будет создан класс, отвечающий за GUI, и реализован некоторый интерфейс к нему. Результатом работы на данном шаге будет являться макет GUI с неработающими элементами, служащий только для демонстрации;

2. Первая версия: на этом шаге будет реализован класс, отвечающий за работу самого сортировочного алгоритма. Затем он будет соединен с классом GUI, используя интерфейсы обоих классов. Будет реализован ввод из файла, добавление окна с комментариями на текущий шаг.

3. Вторая версия: реализация пошаговой работы программы.

4. Третья (конечная) версия: добавление возможности генерация входных данных, анимация движения, подсветка текущего действия. Во время последней итерации будет вестись работа над исправлением ошибок, неочевидными моментами в работе программы и небольшими улучшениями.

 ## Распределение ролей в бригаде

Роли в бригаде распределены следующим образом:

      · Кушкоева Анастасия: реализация алгоритма сортировки внутри класса и методов взаимодействия с ним; написание отчета.
      · Судакова Полина: написание спецификации программы; проектирование системы классов и их взаимодействия; связывание готовых классов программы; написание отчета.
      · Давкаева Валентина: реализация GUI и методов взаимодействия с ним; написание отчета.
  
