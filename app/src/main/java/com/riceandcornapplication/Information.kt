package com.riceandcornapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class InformationActivity : AppCompatActivity() {

    lateinit var t1 : TextView
    lateinit var t2 : TextView
    lateinit var t3 : TextView
    lateinit var t4 : TextView
    lateinit var t5 : TextView
    lateinit var t6 : TextView
    lateinit var i1 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        //icon(?)
        val actionBar = supportActionBar
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.setIcon(R.mipmap.rac_launcher)

        t1 = findViewById(R.id.disease_plant)
        t2 = findViewById(R.id.diag_plant)
        t3 = findViewById(R.id.cause_plant)
        t4 = findViewById(R.id.organism_plant)
        t5 = findViewById(R.id.occurence_plant)
        t6 = findViewById(R.id.principle_plant)
        i1 = findViewById(R.id.graph)


        //diseases and its cause
        t1.setText("\t\t Any disturbance that interferes with the normal structure (e.g., height, tillers, leaves), function (e.g., reduced vigor, early death), and economic value (e.g., reduced yield, poor quality produce) of the plant (HOST) is a DISEASE."
                + "\n\n \t\t A plant disease can be identified (DIAGNOSE) through the characteristic manifestation of diseased conditions (SYMPTOMS) and the presence of visible structures (SIGNS) produced by the pathogen." +
                "\n\n \t\t The casual pathogen agent (PATHOGEN) may be either a living (BIOTIC) or nonliving (ABIOTIC) agent. Biotic agents have the ability to enter and colonize plant parts and other plants (INFECTIOUS)." +
                "\n\n \t\t When a disease increases rapidly in a large plant population over time, a serious outbreak occurs (EPIDEMIC).")
        i1.setImageResource(R.drawable.graph_plant)

        //diagnose of diseases
        t2.setText("\t\t A. Look for symptoms. The symptoms may be visible on the entire plant or any of its parts such as roots, stems, leaves, leaf sheaths, panicles, and grains. The symptoms can be grouped as: " +
                "\n \t\t\t ● Stunting - reduction in plant height"+
                "\n \t\t\t ● Yellowing or chlorosis - deviation from the green color"+
                "\n \t\t\t ● Necrosis - death of tissues (spots, streaks)" +
                "\n \t\t\t ● Wilting - drying of the plant owing to interference in water movement" +
                "\n \t\t\t ● Transformation of organs - abnormal development of plant parts (false smut)"+
                "\n \t\t\t ● Formation of galls - swelling" +
                "\n\n \t\t B. Compare the growth development and appearance with a healthy plant of the same kind and age: they should be of the same height, color, and appearance." +
                "\n\n \t\t In diagnosing a disease in a crop, the following points should be considered:" +
                "\n \t\t\t ● Disease and distribution - Does the disease affect the whole field, in clusters, or individual plants?" +
                "\n \t\t\t ● Disease spread - Does it spread to neighboring plants over time? How fast?" +
                "\n \t\t\t ● Disease occurrence - At what stage of the crop growth is the problem common? Did it affect all most plants in a very short period?" +
                "\n \t\t\t ● Condition of the field - Was it properly prepared and fertilized? How is the drainage condition?" +
                "\n \t\t\t ● Close and thorough examination of the diseased plants - (Noted the symptoms in detail and lo for signs of the disease.) What plant part is affected: whole plant or localized? Were there any different responses among varieties?" +
                "\n \t\t\t ● Look for the presence of the other organisms - Is the problem associated with insects, weeds, and other plants or animals?" +
                "\n \t\t\t ● Note for the presence of toxic substances - Are there pesticide burns and chemical compounds in the field and in the surrounding areas?" +
                "\n \t\t\t ● Consult with the farmer - (Consider the farm practices including farm inputs. the farm management, and disease  history of previous and present crops.)")

        //common cause
        t3.setText("\t\t Living (biotic) factors" +
                "\n \t\t\t ● Caused by organisms that spread from diseased to healthy plants" +
                "\n \t\t\t ● The organisms are very small and are measured as: \n \t\t\t\t\t micron (\u03BC) equivalent to 1/1000mm" +
                "\n \t\t\t\t\t nanometer (\u03B7) equivalent to 1/1000 \u03BC" +
                "\n \t\t\t ● Can be recognized by symptoms and signs" +
                "\n \t\t\t ● Can be managed by destroying or removing the parasitic agent and reducing the number of pathogen and infection rate." +
                "\n\n \t\t Nonliving (abiotic) factors" +
                "\n \t\t\t ● Not spread from diseased to healthy plants" +
                "\n \t\t\t ● Can be recognized only by symptoms" +
                "\n \t\t\t\t Ex. Drying of leaves - lack of moisture or chemical burn" +
                "\n \t\t\t\t     Yellowing of leaves - nutrient deficiency" +
                "\n \t\t\t ● Can be avoided by providing the factor that is lacking" +
                "\n \t\t\t ● More often, it affects a large area within a bried period")

        //organisms
        t4.setText("\t\t Fungi" +
                "\n \t\t\t ● Tiny, simple plants called molds, generally measured in microns" +
                "\n \t\t\t ● No chlorophyll; depends on other  organisms or plant tissues for food" +
                "\n \t\t\t ● Multiply by spores which produce threadlike filaments that enter the host directly or through natural openings" +
                "\n \t\t\t ● Spores are spread by the wind, water, insects, and other carriers" +
                "\n \t\t\t ● Get support from the host by extracting its nutrients" +
                "\n \t\t\t ● Can survive in adverse conditions through special structures (sclerotia) and infects again when favorable condition prevails" +
                "\n\n \t\t Bacteria" +
                "\n \t\t\t ● Small, one-celled organism, measured in microns" +
                "\n \t\t\t ● Lack chlorophyll; cannot produce its own food" +
                "\n \t\t\t ● Reproduced by cell division every 15-20 minutes" +
                "\n \t\t\t ● Survive in seeds, plant debris, soils, tools" +
                "\n \t\t\t ● Spread by wind, water, insects, tools, or soil" +
                "\n \t\t\t ● Generally cause rotting of host tissues" +
                "\n\n \t\t Viruses" +
                "\n \t\t\t ● Smaller than fungi and bacteria, measured in nanometer" +
                "\n \t\t\t ● Can be seen only under an electron microscope" +
                "\n \t\t\t ● Strictly dependent on living organisms for food and reproduction" +
                "\n \t\t\t ● Their presence is generally recognized by the symptoms manifested by the host" +
                "\n \t\t\t ● Generally spread by insects, seeds, soil, nematodes, fungi, or mechanical means")

        //occurence
        t5.setText("\t\t A disease can occur only when the following factors are present at the same time:" +
                "\n \t\t\t ● Pathogen, the causal agent, is virulent." +
                "\n \t\t\t ● Host is susceptible." +
                "\n \t\t\t ● Favorable environmental conditions exist." +
                "\n \t\t\t\t ● Temperature - Bacteria grow rapidly at high temperature. Most insects are also active and multiply fast in warm temperature." +
                "\n \t\t\t\t ● Moisture - High moisture content enhances high germination rate of fungal spores, affects bacteria im entering entering into plant tissue cells, and increases insect number." +
                "\n \t\t\t\t ● Wind - It disperses fungal spores over distance. Strong wind damages plant tissues, thus, creating entry points for bacteria. Light wind current is favorable for insect's movement.")

        //principle
        t6.setText("\t\t Crop production practices influence disease development. Therefore, it is important that disease management be considered in all stages of crop production. Disease management is primarily based on the following principles:" +
                "\n \t\t\t ● Avoidance of the pathogen - Many disease are prevented by choice of planting time and variety. Resistant variety planted in synchrony in a wide area results in very low incidence of insect transmitted disease. The host also escapes infection when planted at the time the pathogen or insect vector populations are in their lowest level." +
                "\n \t\t\t ● Exclusion of inoculum - Preventing the entry into the place where the disease does not exist through seed certification, quarantine, and crop inspection will control the spread of pathogens to new areas." +
                "\n \t\t\t ● Eradication of the pathogen - Reducing or eliminating diseased host by biological control agents, crop rotation, and roguing at the early stage of disease development help reduce the rate of disease spread." +
                "\n \t\t\t ● Protection - The fast spread of the disease by biotic (insect) or abiotic (wind) factors necessitates the inactivation or destruction of the inoculum and insect vector by pesticide application and modification of the plant environment or host nutrition." +
                "\n \t\t\t ● Disease resistance - Preventing infection or reducing the effect of infection through improved plant resistance by genetic manipulation is the most widely used control strategy. The resistance may also be induced by modification of genes through biotechnology." +
                "\n \t\t\t ● Therapy - This is a curative procedure (e.g., hot water treatment) applied to the host to reduce disease severity. However, there is no known cure yet for virus infected plants." +
                "\n \t\t Reliance on one management option will be inadequate or inefficient. Disease management will be most successful if integrated into the crop production system and employs divers approaches.")

    }
}