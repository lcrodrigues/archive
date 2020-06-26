package com.lcrodrigues.archive

object MemoryObject {

    private val questionsList: ArrayList<Question> = arrayListOf()

    fun createQuestionsList() {
        questionsList.addAll(
            listOf(
                Question(
                "73",
                "Produto do fim da Guerra Fria, a Convenção sobre a Proibição das Armas Químicas (CPAQ) marcou um momento  novo  das  relações  internacionais  no  campo  da  segurança.  Aberta  para  assinaturas  em  Paris, em janeiro de 1993, após cerca de duas décadas de negociações  na  Conferência  do  Desarmamento  em Genebra, a CPAQ entrou em vigor em abril de 1997. Ao abrir a I Conferência dos Estados-Partes na CPAQ, em  Haia,  o  secretário-geral  da  ONU,  Kofi  Annan, descreveu o evento como um “momentoso ato de paz”. Disse: “O que vocês fizeram com sua livre vontade foi anunciar a essa e a todas as futuras gerações que as armas químicas são instrumentos que nenhum Estado com  algum  respeito  por  si  mesmo  e  nenhum  povo com  algum  senso  de  dignidade  usaria  em  conflitos domésticos ou internacionais”.",
                "BUSTANI, J. M. A Convenção sobre a Proibição de Armas Químicas: trajetória futura. Parcerias Estratégicas, n. 9, out. 2000.",
                "O  que  a  Convenção  representou  para  o  cenário geopolítico mundial?",
                listOf(
                    "Esgotamento dos pactos bélicos multilaterais.",
                    "Restrição aos complexos industriais militares.",
                    "Enfraquecimento de blocos políticos regionais.",
                    "Cerceamento às agências de inteligência estatal.",
                    "Desestabilização   das   empresas   produtoras   de   munições."
                ),
                "B",
                "Com o acordo, o desenvolvimento de armas químicas tornou-se proibido, limitando o desenvolvimento desse tipo de armamento por parte dos complexos industriais militares."
                ),
                Question(
                    "85",
                    "Tomás  de  Aquino,  filósofo  cristão  que  viveu  no século XIII, afirma: a lei é uma regra ou um preceito relativo às nossas ações. Ora, a norma suprema dos atos  humanos  é  a  razão.  Desse  modo,  em  última análise, a lei está submetida à razão; é apenas uma formulação das exigências racionais. Porém, é mister que ela emane da comunidade, ou de uma pessoa que legitimamente a representa.",
                    "GILSON, E.; BOEHNER, P. História da filosofia cristã. Petrópolis: Vozes, 1991 (adaptado).",
                    "No contexto do século XIII, a visão política do filósofo mencionado retoma o:",
                    listOf(
                        "pensamento idealista de Platão.",
                        "conformismo estoico de Sêneca.",
                        "ensinamento místico de Pitágoras.",
                        "paradigma de vida feliz de Agostinho.",
                        "conceito de bem comum de Aristóteles."
                    ),
                    "E",
                    "Vai doer, vai durar."
                ),
                Question(
                    "86",
                    "TEXTO IEu  queria  movimento  e  não  um  curso  calmo  da  existência. Queria excitação e perigo e a oportunidade de  sacrificar-me  por  meu  amor.  Sentia  em  mim  uma superabundância  de  energia  que  não  encontrava escoadouro em nossa vida.\n TEXTO IIMeu lema me obrigava, mais que a qualquer outro homem, a um enunciado mais exato da verdade; não sendo suficiente que eu lhe sacrificasse em tudo o meu  interesse  e  as  minhas  simpatias,  era  preciso sacrificar-lhe  também  minha  fraqueza  e  minha natureza tímida. Era preciso ter a coragem e a força de ser sempre verdadeiro em todas as ocasiões.",
                    "TOLSTÓI, L. Felicidade familiar. Apud KRAKAUER, J. Na natureza selvagem. São Paulo: Cia. das Letras, 1998. / ROUSSEAU, J.-J. Os devaneios do caminhante solitário. Porto Alegre: L&PM, 2009.",
                    "Os  textos  de  Tolstói  e  Rousseau  retratam  ideais  da existência humana e defendem uma experiência:",
                    listOf(
                        "lógico-racional,  focada  na  objetividade,  clareza  e imparcialidade.",
                        "místico-religiosa, ligada à sacralidade, elevação e espiritualidade.",
                        "sociopolítica,   constituída   por   integração, solidariedade e organização.",
                        "naturalista-científica, marcada pela experimentação, análise e explicação.",
                        "estético-romântica,  caracterizada  por  sinceridade, vitalidade e impulsividade."
                    ),
                    "E",
                    "Nada impede a onda de passar."
                )
            )
        )
    }

    fun getQuestion(): Question {
        return questionsList[0]
    }

}