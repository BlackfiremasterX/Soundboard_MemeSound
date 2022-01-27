package com.example.tablelayout_test



import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private var soundId1 = 0
    private var soundId2 = 0
    private var soundId3 = 0
    private var soundId4 = 0
    private var soundId5 = 0
    private var soundId6 = 0
    private var soundId7 = 0
    private var soundId8 = 0
    private var soundId9 = 0
    private var soundId10 = 0
    private var soundId11 = 0
    private var soundId12 = 0
    private var soundId13 = 0
    private var soundId14 = 0
    private var soundId15 = 0
    private var soundId16 = 0
    private var soundId17 = 0
    private var soundId18 = 0
    private var soundId19 = 0
    private var soundId20 = 0
    private var soundId21 = 0
    private var soundId22 = 0
    private var soundId23 = 0
    private var soundId24 = 0
    private var soundId25 = 0
    private var soundId26 = 0
    private var soundId27 = 0
    private var soundId28 = 0
    private var soundId29 = 0
    private var soundId30 = 0
    private var soundId31 = 0
    private var soundId32 = 0
    private var soundId33 = 0
    private var soundId34 = 0
    private var soundId35 = 0

    //SoundPool Settings Global
    private var leftVolume = 1F
    private var rightVolume = 1F
    private var soundPriorityGlobal = 3


    fun playSound(sound: Int) {
        var soundBuffer = 0
        when (sound) {
            1 -> soundBuffer = soundId1
            2 -> soundBuffer = soundId2
            3 -> soundBuffer = soundId3
            4 -> soundBuffer = soundId4
            5 -> soundBuffer = soundId5
            6 -> soundBuffer = soundId6
            7 -> soundBuffer = soundId7
            8 -> soundBuffer = soundId8
            9 -> soundBuffer = soundId9
            10 -> soundBuffer = soundId10
            11 -> soundBuffer = soundId11
            12 -> soundBuffer = soundId12
            13 -> soundBuffer = soundId13
            14 -> soundBuffer = soundId14
            15 -> soundBuffer = soundId15
            16 -> soundBuffer = soundId16
            17 -> soundBuffer = soundId17
            18 -> soundBuffer = soundId18
            19 -> soundBuffer = soundId19
            20 -> soundBuffer = soundId20
            21 -> soundBuffer = soundId21
            22 -> soundBuffer = soundId22
            23 -> soundBuffer = soundId23
            24 -> soundBuffer = soundId24
            25 -> soundBuffer = soundId25
            26 -> soundBuffer = soundId26
            27 -> soundBuffer = soundId27
            28 -> soundBuffer = soundId28
            29 -> soundBuffer = soundId29
            30 -> soundBuffer = soundId30
            31 -> soundBuffer = soundId31
            32 -> soundBuffer = soundId32
            33 -> soundBuffer = soundId33
            34 -> soundBuffer = soundId34
            35 -> soundBuffer = soundId35
        }
        soundPool?.play(soundBuffer, leftVolume, rightVolume, soundPriorityGlobal, 0, 1F)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        soundPool = SoundPool(6,AudioManager.STREAM_MUSIC,100)


        soundId1 = soundPool!!.load(baseContext, R.raw.aaaa_za_donbass,soundPriorityGlobal)
        soundId2 = soundPool!!.load(baseContext, R.raw.amogus,soundPriorityGlobal)
        soundId3 = soundPool!!.load(baseContext, R.raw.bababooey,soundPriorityGlobal)
        soundId4 = soundPool!!.load(baseContext, R.raw.badumtss,soundPriorityGlobal)
        soundId5 = soundPool!!.load(baseContext, R.raw.illuminati,soundPriorityGlobal)
        soundId6 = soundPool!!.load(baseContext, R.raw.kak_kontrit,soundPriorityGlobal)
        soundId7 = soundPool!!.load(baseContext, R.raw.kazahstan,soundPriorityGlobal)
        soundId8 = soundPool!!.load(baseContext, R.raw.kryisa,soundPriorityGlobal)
        soundId9 = soundPool!!.load(baseContext, R.raw.mafioznik,soundPriorityGlobal)
        soundId10 = soundPool!!.load(baseContext, R.raw.mama_prishla,soundPriorityGlobal)
        soundId11 = soundPool!!.load(baseContext, R.raw.maynkraft_moya_jizn,soundPriorityGlobal)
        soundId12 = soundPool!!.load(baseContext, R.raw.ne_nada,soundPriorityGlobal)
        soundId13 = soundPool!!.load(baseContext, R.raw.ne_nada_dadya,soundPriorityGlobal)
        soundId14 = soundPool!!.load(baseContext, R.raw.nyuhay_bebru,soundPriorityGlobal)
        soundId15 = soundPool!!.load(baseContext, R.raw.omaewamou,soundPriorityGlobal)
        soundId16 = soundPool!!.load(baseContext, R.raw.otdihau,soundPriorityGlobal)
        soundId17 = soundPool!!.load(baseContext, R.raw.poganaya,soundPriorityGlobal)
        soundId18 = soundPool!!.load(baseContext, R.raw.pojili,soundPriorityGlobal)
        soundId19 = soundPool!!.load(baseContext, R.raw.povezlo,soundPriorityGlobal)
        soundId20 = soundPool!!.load(baseContext, R.raw.r2d2_swf,soundPriorityGlobal)
        soundId21 = soundPool!!.load(baseContext, R.raw.rayonnyiy_prokuror,soundPriorityGlobal)
        soundId22 = soundPool!!.load(baseContext, R.raw.razryivnaya,soundPriorityGlobal)
        soundId23 = soundPool!!.load(baseContext, R.raw.rejisser_kiborg_ubiytsa,soundPriorityGlobal)
        soundId24 = soundPool!!.load(baseContext, R.raw.salo_salo,soundPriorityGlobal)
        soundId25 = soundPool!!.load(baseContext, R.raw.silnoe_zayavlenie,soundPriorityGlobal)
        soundId26 = soundPool!!.load(baseContext, R.raw.terminator,soundPriorityGlobal)
        soundId27 = soundPool!!.load(baseContext, R.raw.to_be_continued,soundPriorityGlobal)
        soundId28 = soundPool!!.load(baseContext, R.raw.vsego_horoshego,soundPriorityGlobal)
        soundId29 = soundPool!!.load(baseContext, R.raw.vyi_kto_takie,soundPriorityGlobal)
        soundId30 = soundPool!!.load(baseContext, R.raw.vot_eto_povorot,soundPriorityGlobal)
        soundId31 = soundPool!!.load(baseContext, R.raw.tutututu_demotivator,soundPriorityGlobal)
        soundId32 = soundPool!!.load(baseContext, R.raw.slezyi_sopli,soundPriorityGlobal)
        soundId33 = soundPool!!.load(baseContext, R.raw.vsego_horoshego,soundPriorityGlobal)
        soundId34 = soundPool!!.load(baseContext, R.raw.maloletnie_debilyi,soundPriorityGlobal)
        soundId35 = soundPool!!.load(baseContext, R.raw.nani,soundPriorityGlobal)



        findViewById<ImageView>(R.id.iv_cell_1_1).setOnClickListener { playSound(1) }
        findViewById<ImageView>(R.id.iv_cell_1_2).setOnClickListener { playSound(2) }
        findViewById<ImageView>(R.id.iv_cell_1_3).setOnClickListener { playSound(3) }
        findViewById<ImageView>(R.id.iv_cell_1_4).setOnClickListener { playSound(4) }
        findViewById<ImageView>(R.id.iv_cell_1_5).setOnClickListener { playSound(5) }
        findViewById<ImageView>(R.id.iv_cell_2_1).setOnClickListener { playSound(6) }
        findViewById<ImageView>(R.id.iv_cell_2_2).setOnClickListener { playSound(7) }
        findViewById<ImageView>(R.id.iv_cell_2_3).setOnClickListener { playSound(8) }
        findViewById<ImageView>(R.id.iv_cell_2_4).setOnClickListener { playSound(9) }
        findViewById<ImageView>(R.id.iv_cell_2_5).setOnClickListener { playSound(10) }
        findViewById<ImageView>(R.id.iv_cell_3_1).setOnClickListener { playSound(11) }
        findViewById<ImageView>(R.id.iv_cell_3_2).setOnClickListener { playSound(12) }
        findViewById<ImageView>(R.id.iv_cell_3_3).setOnClickListener { playSound(13) }
        findViewById<ImageView>(R.id.iv_cell_3_4).setOnClickListener { playSound(14) }
        findViewById<ImageView>(R.id.iv_cell_3_5).setOnClickListener { playSound(15) }
        findViewById<ImageView>(R.id.iv_cell_4_1).setOnClickListener { playSound(16) }
        findViewById<ImageView>(R.id.iv_cell_4_2).setOnClickListener { playSound(17) }
        findViewById<ImageView>(R.id.iv_cell_4_3).setOnClickListener { playSound(18) }
        findViewById<ImageView>(R.id.iv_cell_4_4).setOnClickListener { playSound(19) }
        findViewById<ImageView>(R.id.iv_cell_4_5).setOnClickListener { playSound(20) }
        findViewById<ImageView>(R.id.iv_cell_5_1).setOnClickListener { playSound(21) }
        findViewById<ImageView>(R.id.iv_cell_5_2).setOnClickListener { playSound(22) }
        findViewById<ImageView>(R.id.iv_cell_5_3).setOnClickListener { playSound(23) }
        findViewById<ImageView>(R.id.iv_cell_5_4).setOnClickListener { playSound(24) }
        findViewById<ImageView>(R.id.iv_cell_5_5).setOnClickListener { playSound(25) }
        findViewById<ImageView>(R.id.iv_cell_6_1).setOnClickListener { playSound(26) }
        findViewById<ImageView>(R.id.iv_cell_6_2).setOnClickListener { playSound(27) }
        findViewById<ImageView>(R.id.iv_cell_6_3).setOnClickListener { playSound(28) }
        findViewById<ImageView>(R.id.iv_cell_6_4).setOnClickListener { playSound(29) }
        findViewById<ImageView>(R.id.iv_cell_6_5).setOnClickListener { playSound(30) }
        findViewById<ImageView>(R.id.iv_cell_7_1).setOnClickListener { playSound(31) }
        findViewById<ImageView>(R.id.iv_cell_7_2).setOnClickListener { playSound(32) }
        findViewById<ImageView>(R.id.iv_cell_7_3).setOnClickListener { playSound(33) }
        findViewById<ImageView>(R.id.iv_cell_7_4).setOnClickListener { playSound(34) }
        findViewById<ImageView>(R.id.iv_cell_7_5).setOnClickListener { playSound(35) }

    }
}