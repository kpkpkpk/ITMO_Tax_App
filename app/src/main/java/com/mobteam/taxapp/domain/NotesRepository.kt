package com.mobteam.taxapp.domain

import com.mobteam.taxapp.domain.model.Note

class NotesRepository {

    private val notes = listOf(
        Note(id = 1, noteHeaderText = "Что такое налоги?", noteSubHeadText = "Введение в налоги", noteImage = "https://static.norma.uz/images/181439_5f4ffe2cf368ebb58395307b4980.png", content = """
        Налоги - это финансовые взносы, налагаемые правительством на физических и юридических лиц. Они необходимы для финансирования общественных услуг и инфраструктуры, таких как образование, здравоохранение и транспорт. Существуют различные виды налогов, включая подоходный налог, налог с продаж, налог на имущество и другие.

         Виды налогов
        - Подоходный налог: Налог на доходы физических и юридических лиц.
        - Налог с продаж: Взимается с продажи товаров и услуг.
        - Налог на имущество: Налог на владение имуществом, включая землю и здания.
        - Акцизный налог: Применяется к определенным товарам, таким как алкоголь и табак.

         Цель налогов
        Налоги помогают правительствам собирать доходы для оплаты общественных услуг и товаров, которые приносят пользу обществу. Они также играют роль в перераспределении богатства и регулировании экономической деятельности.

         Основные выводы
        - Налоги - это обязательные финансовые взносы.
        - Они финансируют важные общественные услуги.
        - Различные виды налогов нацелены на разные источники доходов и транзакции.
    """.trimIndent()),
        Note(id = 2, noteHeaderText = "Основы подоходного налога", noteSubHeadText = "Понимание подоходного налога", noteImage = "https://img.freepik.com/premium-photo/man-working-with-calculator-documents-tax-concept_392895-34882.jpg?w=1800", content = """
        Подоходный налог - это налог, взимаемый с доходов физических и юридических лиц. Это основной источник доходов для правительств.

         Понимание подоходного налога
        - Налогооблагаемый доход: Часть дохода, подлежащая налогообложению, после вычетов и освобождений.
        - Налоговые скобки: Различные уровни доходов облагаются налогом по разным ставкам.
        - Статус подачи: Определяет налоговую ставку и доступные вычеты, включает статусы, такие как одиночка, женатый, подающий совместно, и глава семьи.

         Расчет подоходного налога
        1. Определите валовой доход: Общий доход до вычетов.
        2. Вычтите вычеты и освобождения: Это могут быть стандартные вычеты, детализированные вычеты и личные освобождения.
        3. Примените налоговые ставки: Используйте налоговые скобки для определения суммы налога.

         Примеры
        - Пример 1: Одиночка с налогооблагаемым доходом $50,000 может попадать в налоговую скобку, требующую уплаты 22% с части этого дохода.
        - Пример 2: Женатая пара с доходом $100,000 и вычетами на $20,000 будет иметь налогооблагаемый доход $80,000.

         Основные выводы
        - Понимайте, что составляет налогооблагаемый доход.
        - Знайте налоговые скобки и как они применяются к вашему доходу.
        - Правильно учитывайте вычеты и освобождения, чтобы минимизировать налогооблагаемый доход.
    """.trimIndent()),
        Note(id = 3, noteHeaderText = "Налоговые вычеты и кредиты", noteSubHeadText = "Снижение вашего налогового счета", noteImage = "https://e-notabene.ru/generated/19620/index.files/image004.png", content = """
        Налоговые вычеты и кредиты могут значительно снизить вашу налоговую обязанность. Хотя оба снижают ваш налоговый счет, они работают по-разному.

         Налоговые вычеты
        Вычеты снижают налогооблагаемый доход. Наиболее распространенные типы включают:
        - Стандартный вычет: Фиксированная сумма в зависимости от статуса подачи.
        - Детализированные вычеты: Конкретные расходы, такие как проценты по ипотеке, государственные налоги и благотворительные пожертвования.

         Налоговые кредиты
        Кредиты непосредственно уменьшают сумму налога, которую вы должны. Типы кредитов включают:
        - Кредит на заработанный доход (EITC): Для лиц с низким и умеренным доходом.
        - Детский налоговый кредит: Для семей с детьми, соответствующими требованиям.
        - Образовательные кредиты: За обучение и связанные с ним расходы, например, кредит американской возможности.

         Примеры
        - Пример вычета: Налогоплательщик с доходом $60,000 и детализированными вычетами на $10,000 будет иметь налогооблагаемый доход $50,000.
        - Пример кредита: Налоговый кредит на $1,000 снижает ваш налоговый счет на $1,000.

         Максимизация вычетов и кредитов
        - Ведите учет: Храните документацию для всех вычитаемых расходов.
        - Планируйте заранее: Рассмотрите время для медицинских расходов или благотворительных пожертвований, чтобы максимизировать выгоды в определенном налоговом году.
        - Консультируйтесь с профессионалом: Налоговые профессионалы могут помочь определить допустимые вычеты и кредиты.

         Основные выводы
        - Понимайте разницу между вычетами (уменьшают налогооблагаемый доход) и кредитами (уменьшают налоговый счет).
        - Ведите детальный учет для поддержки ваших вычетов и кредитов.
        - Планируйте и стратегически используйте доступные налоговые льготы.
    """.trimIndent()),
        Note(id = 4, noteHeaderText = "Объяснение налога с продаж", noteSubHeadText = "Потребительские налоги", noteImage = "https://cdnstatic.rg.ru/crop980x675/uploads/images/195/23/95/TASS_35224121.jpg", content = """
        Налог с продаж - это налог на потребление, налагаемый правительством на продажу товаров и услуг. Обычно это процент от продажной цены.

         Как работает налог с продаж
        - Налоговая ставка: Различается по штатам и местностям. Некоторые товары могут быть освобождены от налога или облагаться по другим ставкам.
        - Сбор: Продавцы собирают налог с продаж при продаже и передают его правительству.

         Пример расчета
        - Сценарий: Покупка товара за $100 в штате с налогом с продаж 7%.
        - Расчет: $100 x 7% = $7. Общая стоимость составляет $107.

         Освобождения и особые случаи
        - Необходимости: В некоторых штатах освобождаются от налога продукты питания, медикаменты и одежда.
        - Праздничные налоговые скидки: Освобождение от налога на выходные для школьных принадлежностей или товаров для подготовки к чрезвычайным ситуациям.

         Онлайн и удаленные продажи
        С ростом электронной коммерции налоговые законы адаптировались. Многие штаты требуют, чтобы онлайн-ритейлеры собирали налог с продаж, даже если у них нет физического присутствия в штате.

         Основные выводы
        - Ставки налога с продаж различаются в зависимости от местоположения и типа товаров.
        - Продавцы обязаны собирать и передавать налог с продаж.
        - Понимайте освобождения и особые случаи, чтобы знать, когда применяется налог с продаж.
    """.trimIndent()),
        Note(id = 5, noteHeaderText = "Налоги на имущество", noteSubHeadText = "Налоги на недвижимость", noteImage = "https://pgt68.ru/wp-content/uploads/2022/10/500x339.jpg", content = """
        Налог на имущество - это налог на недвижимость, включая землю и здания. Местные правительства в первую очередь используют его для финансирования общественных услуг, таких как школы, полиция и инфраструктура.

         Как оцениваются налоги на имущество
        - Оценка: Местные органы власти периодически оценивают стоимость имущества.
        - Налоговая ставка: Известна как ставка в милли, представляет собой сумму налога на тысячу денежных единиц стоимости имущества.

         Пример расчета
        - Сценарий: Дом стоимостью $200,000 со ставкой 20 миллей.
        - Расчет: $200,000 / 1,000 x 20 = $4,000 ежегодного налога на имущество.

         Обжалование оценки
        - Проверка: Убедитесь, что оценка отражает текущую рыночную стоимость.
        - Обжалование: Подайте апелляцию, если считаете, что ваша собственность переоценена. Предоставьте доказательства, такие как недавние продажи аналогичных объектов.

         Освобождения и скидки
        - Освобождение для домовладельцев: Уменьшает налогооблагаемую стоимость для основных мест проживания.
        - Освобождение для пожилых граждан: Дополнительные скидки для пожилых домовладельцев.

         Основные выводы
        - Налоги на имущество финансируют важные местные услуги.
        - Понимайте, как оценивается ваша собственность и как обжаловать неправильные оценки.
        - Знайте об освобождениях и скидках, которые могут снизить ваш налог на имущество.
    """.trimIndent()),
        Note(id = 6, noteHeaderText = "Подача налоговой декларации", noteSubHeadText = "Процесс подачи налогов", noteImage = "https://media.istockphoto.com/id/1344766725/ru/%D1%84%D0%BE%D1%82%D0%BE/1040-%D1%84%D0%BE%D1%80%D0%BC%D0%B0-%D0%B4%D0%B5%D0%BA%D0%BB%D0%B0%D1%80%D0%B0%D1%86%D0%B8%D0%B8-%D0%BF%D0%BE-%D0%B8%D0%BD%D0%B4%D0%B8%D0%B2%D0%B8%D0%B4%D1%83%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D0%BC%D1%83-%D0%BF%D0%BE%D0%B4%D0%BE%D1%85%D0%BE%D0%B4%D0%BD%D0%BE%D0%BC%D1%83-%D0%BD%D0%B0%D0%BB%D0%BE%D0%B3%D1%83-%D1%81%D1%88%D0%B0.jpg?s=612x612&w=0&k=20&c=AxktoZ-uw_epxv-7YHxKHi4Pa8tffgsEAkuIm2li0JQ=", content = """
        Подача налоговой декларации включает отчет о вашем доходе, вычетах и кредитах в IRS для определения вашей налоговой обязанности.

         Шаги для подачи
        1. Соберите документацию: W-2, 1099, квитанции для вычетов.
        2. Выберите метод подачи: Бумажные формы, электронные файлы или налоговый профессионал.
        3. Заполните формы: Заполните необходимые налоговые формы, такие как форма 1040.
        4. Отправьте декларацию: Подайте до крайнего срока (обычно 15 апреля), чтобы избежать штрафов.

         Основные формы
        - Форма 1040: Основная форма для индивидуальных налоговых деклараций.
        - Приложение A: Для детализированных вычетов.
        - Приложение C: Для доходов от самозанятости.

         Общие ошибки, которых следует избегать
        - Неправильная информация: Проверьте номера социального страхования, имена и расчеты.
        - Пропуск крайних сроков: Подайте вовремя, чтобы избежать штрафов и пени.
        - Игнорирование вычетов и кредитов: Убедитесь, что вы заявляете все допустимые вычеты и кредиты.

         Получение помощи
        - Налоговое программное обеспечение: Проводит вас через процесс с подсказками и проверками.
        - Налоговые профессионалы: Предоставляют персонализированные советы и обрабатывают сложные ситуации.
        - Ресурсы IRS: Бесплатные инструменты и информация, доступные на сайте IRS.

         Основные выводы
        - Оставайтесь организованными и отслеживайте важные документы.
        - Выберите метод подачи, который соответствует вашим потребностям.
        - Проверьте точность, чтобы избежать общих ошибок при подаче.
    """.trimIndent()),
        Note(id = 7, noteHeaderText = "Стратегии налогового планирования", noteSubHeadText = "Оптимизация ваших налогов", noteImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSRcyrzG755X1lphDuw-6hOxJc-_9dve7HOxoe1Or07sA&s", content = """
        Эффективное налоговое планирование может помочь вам минимизировать налоговую обязанность и оптимизировать ваше финансовое положение.

         Основные стратегии
        - Взносы на пенсию: Взносы в 401(k) и IRA могут уменьшить налогооблагаемый доход.
        - Время доходов и вычетов: Стратегически планируйте доходы и вычитаемые расходы, чтобы оптимизировать налоговые льготы.
        - Налогово-эффективные инвестиции: Вкладывайте в налогово-привилегированные счета и учитывайте налоговые последствия инвестиционных решений.

         Примерные стратегии
        - Максимизация взносов на пенсию: Вносите максимум, допустимый для пенсионных счетов, чтобы уменьшить налогооблагаемый доход.
        - Сгруппирование вычетов: Объедините вычеты в один налоговый год, чтобы превысить порог стандартного вычета.
        - Налоговое урезание убытков: Продавайте инвестиции с убытками, чтобы компенсировать прибыли и уменьшить налогооблагаемый доход.

         Годовое планирование
        - Обзор доходов и расходов: Оцените свое финансовое положение до конца года.
        - Сделайте последние взносы: Внесите взносы на пенсионные счета и сделайте благотворительные пожертвования до 31 декабря.
        - Оцените налоги: Используйте налоговое программное обеспечение или проконсультируйтесь с профессионалом, чтобы оценить вашу налоговую обязанность и скорректировать удержания, если необходимо.

         Основные выводы
        - Планируйте в течение года, чтобы полностью использовать возможности для экономии налогов.
        - Пересматривайте и корректируйте стратегии по мере изменения вашего финансового положения.
        - Консультируйтесь с налоговым профессионалом для получения персонализированных советов и для навигации в сложных ситуациях.
    """.trimIndent()),
        Note(id = 8, noteHeaderText = "Налоги на самозанятость", noteSubHeadText = "Налоги для фрилансеров", noteImage = "https://самозанятые.рф/blog/wp-content/uploads/2023/07/14.07_sz-v-otchetnosti_blog.png", content = """
        Самозанятые лица имеют уникальные налоговые обязательства, включая налог на самозанятость, который покрывает налоги на социальное обеспечение и медицинскую помощь.

         Понимание налога на самозанятость
        - Ставка: 15.3% от чистого заработка, из которых 12.4% на социальное обеспечение и 2.9% на медицинскую помощь.
        - Расчет: Основывается на чистом заработке от самозанятости.

         Вычеты для самозанятых
        - Вычет на домашний офис: Часть домашних расходов можно вычесть, если используется исключительно для бизнеса.
        - Бизнес-расходы: Вычитаемые расходы включают в себя материалы, поездки и профессиональные услуги.
        - Страховые премии на здоровье: Самозанятые лица могут вычитать страховые премии на здоровье.

         Квартальные расчетные налоги
        - Требование: Самозанятые лица должны платить расчетные налоги ежеквартально, чтобы избежать штрафов.
        - Расчет: Оцените общую налоговую обязанность за год и разделите на четыре части.

         Ведение учета
        - Сохраняйте записи: Ведите детальный учет всех доходов и расходов.
        - Используйте бухгалтерское программное обеспечение: Такие инструменты, как QuickBooks, могут упростить ведение учета и подготовку налогов.

         Основные выводы
        - Понимайте налог на самозанятость и как он применяется к вашему заработку.
        - Воспользуйтесь доступными вычетами, чтобы уменьшить налогооблагаемый доход.
        - Платите расчетные налоги ежеквартально, чтобы оставаться в соответствии с требованиями и избежать штрафов.
    """.trimIndent()),
        Note(id = 9, noteHeaderText = "Налоговые проверки", noteSubHeadText = "Чего ожидать", noteImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfcKWxsd1rVzsm7EOsR9QhJ_hVsvzDpWpCHfyNFBmpxQ&s", content = """
        Налоговая проверка - это проверка вашей налоговой декларации IRS или государственным налоговым органом для проверки ее точности.

         Виды проверок
        - Корреспонденционная проверка: Проводится по почте, обычно для незначительных вопросов.
        - Офисная проверка: Требует посещения офиса IRS с документацией.
        - Полевые проверки: Включают визит аудитора в ваш дом или бизнес.

         Триггеры для проверок
        - Необычные вычеты: Большие или необычные вычеты могут привлечь внимание.
        - Высокий доход: Более высокие уровни дохода могут увеличить вероятность проверки.
        - Ошибки: Ошибки или несоответствия в вашей налоговой декларации.

         Подготовка к проверке
        - Соберите документацию: Соберите все соответствующие записи и квитанции.
        - Просмотрите декларацию: Понимайте элементы, которые подвергаются проверке.
        - Консультируйтесь с профессионалом: Рассмотрите возможность найма налогового профессионала для представительства.

         Во время проверки
        - Будьте кооперативны: Предоставляйте запрашиваемую информацию оперативно.
        - Оставайтесь организованными: Отслеживайте документы и коммуникации.
        - Знайте свои права: Понимайте свои права как налогоплательщик во время проверки.

         После проверки
        - Результат: Проверка может привести к отсутствию изменений, дополнительным налогам или возврату средств.
        - Апелляция: Если вы не согласны с результатами, вы можете обжаловать решение.

         Основные выводы
        - Знайте общие триггеры проверки и подготовьтесь соответственно.
        - Ведите тщательный учет для поддержки вашей налоговой декларации.
        - Понимайте свои права и варианты, если выбраны для проверки.
    """.trimIndent()),
        Note(id = 10, noteHeaderText = "Международное налогообложение", noteSubHeadText = "Налоги на глобальный доход", noteImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3m6DjXSLHEslWKwdrNufCisyxF5Pzbh1KhNK-6IAEBA&s", content = """
        Международное налогообложение включает налоговые правила и нормы для физических и юридических лиц, получающих доход из иностранных источников.

         Ключевые концепции
        - Резиденция: Определяет налоговые обязательства на основе места жительства и работы.
        - Двойное налогообложение: Происходит, когда один и тот же доход облагается налогом в двух разных странах.

         Отчет о иностранном доходе
        - Исключение из иностранного заработанного дохода (FEIE): Позволяет налогоплательщикам США исключить определенную сумму иностранного дохода из налогообложения в США.
        - Иностранный налоговый кредит (FTC): Кредиты за налоги, уплаченные иностранным правительствам, уменьшающие налоговую обязанность в США.

         Налоговые договоры
        - Цель: Предотвращение двойного налогообложения и разрешение налоговых споров.
        - Преимущества: Более низкие налоговые ставки и конкретные положения для различных видов дохода.

         Примерные ситуации
        - Экспатрианты: Граждане США, живущие за границей, должны отчитываться о глобальном доходе и могут использовать FEIE или FTC.
        - Многонациональные компании: Должны навигировать сложные правила для доходов, полученных в нескольких юрисдикциях.

         Соответствие требованиям
        - FATCA: Закон о соблюдении налоговых обязательств по иностранным счетам требует отчета о иностранных финансовых активах.
        - FBAR: Отчет о иностранных банковских и финансовых счетах требует раскрытия иностранных счетов, превышающих определенные пороги.

         Основные выводы
        - Понимайте свой статус резидента и его влияние на налоговые обязательства.
        - Используйте исключения, кредиты и налоговые договоры, чтобы минимизировать двойное налогообложение.
        - Соблюдайте требования отчетности для иностранного дохода и активов.
    """.trimIndent())
    )


    fun getNotes() : List<Note> = notes

    fun getNoteById(id : Int) : Note = notes.first { it.id == id }
}