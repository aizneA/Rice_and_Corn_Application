package com.riceandcornapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.riceandcornapplication.databinding.ActivityCropDiseaseInformationBinding

class CropDiseaseInformationActivity : AppCompatActivity(), CropClickListener {

    private lateinit var binding: ActivityCropDiseaseInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCropDiseaseInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateCrops()

        val MainActivity = this

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter = CardAdapter(cropList, MainActivity)
        }
    }

    override fun onClick(crop: Crop) {
        val intent = Intent(applicationContext, DetailedDiseaseInformation::class.java)
        intent.putExtra(CROP_ID_EXTRA, crop.id)
        startActivity(intent)
    }

    private fun populateCrops() {

        val crop1 = Crop(
            R.drawable.crop_ccr,
            crop_disease = "Corn Common Rust",
            crop_scientific = "Puccinia sorghi",
            what_why = "What is Corn Common Rust",
            detail_info = "\t Common rust produces rust-colored to dark brown, elongated pustules on both leaf surfaces. The pustules contain rust spores (urediniospores) that are cinnamon brown in color. Pustules darken as they age. Leaves, as well as sheaths, can be infected. Under severe conditions leaf chlorosis and death may occur. Common rust can be differentiated from Southern rust by the brown pustules occurring on both top and bottom leaf surfaces with common rust.",
            how_crop = "Symptoms",
            second_info = "\t Symptoms of common rust often appear after silking.\n" +
                    "\n" +
                    "\t \t \u25CF Small, round to elongate brown pustules form on both leaf surfaces and other above ground parts of the plant.\n" +
                    "\n" +
                    "\t \t \u25CF As the pustules mature they become brown to black.\n" +
                    "\n" +
                    "\t \t \u25CF If disease is severe, the leaves may yellow and die early.",
            imp_mngmt = "How to Manage",
            third_info = "\t Effective management of Gray leaf spot involves the use of resistant hybrids, rotation with non-hosts, and residue management.  In years where disease risk is high or growers have planted susceptible hybrids in no till fields, fungicides may be considered.",
            disease_cycle = R.drawable.commonrust
        )
        cropList.add(crop1)

        val crop2 = Crop(
            R.drawable.crop_gls,
            crop_disease = "Gray Leaf Spot",
            crop_scientific = "Cercospora zeae-maydis",
            what_why = "\t What is Corn Gray Leaf Spot",
            detail_info = "The disease first appears in the form of small, necrotic spots with halos. These usually expand to become rectangular lesions, about 1/8 inch wide by up to 2 inches to 3 inches long and gray to brown in appearance. Mature lesions usually have distinct parallel edges and appear opaque when put up to the light, but the lesions hybrids vary widely in shape and color. Symptoms can sometimes be confused with northern corn leaf spot, although gray leaf spot lesions are usually limited on the sides by veins.",
            how_crop = "Symptoms",
            second_info = "\t Symptoms of gray leaf spot are usually first noticed in the lower leaves.\n" +
                    "\n" +
                    "\t \t \u25CF Initially, lesions of gray leaf spot begin as a small dot with a yellow halo.\n" +
                    "\n" +
                    "\t \t \u25CF Lesions will elongate over time running parallel to the veins becoming pale brown to gray and rectangular in shape with blunt ends. These lesions can be described as having the appearance of a “matchstick.”\n" +
                    "\n" +
                    "\t \t \u25CF Lesions may eventually coalesce killing the leaves.\n" +
                    "\n" +
                    "\t \t \u25CF Leaves appear grayish in color due to the presence of fungal spores.",
            imp_mngmt = "How to Manage",
            third_info = "\t Disease management tactics include using resistant corn hybrids, conventional tillage where appropriate, and crop rotation. Foliar fungicides can be effective if economically warranted. Typically they are only profitable on susceptible inbreds or susceptible hybrids under a combination of high risk conditions with high yield potential, prolonged humid conditions, and evidence of disease development.",
            disease_cycle = R.drawable.grayleafspot
        )
        cropList.add(crop2)

        val crop3 = Crop(
            R.drawable.crop_lb,
            crop_disease = "Corn Leaf Blight",
            crop_scientific = "Setosphaeria turcica",
            what_why = "What is Corn Leaf Blight",
            detail_info = "\t Typical symptoms of northern corn leaf blight are canoe-shaped lesions 1 inch to 6 inches long. The lesions are initially bordered by gray-green margins. They eventually turn tan colored and may contain dark areas of fungal sporulation. The length or size of lesions may vary with in different corn hybrids reactions with different resistance genes. Lesions begin on the lower leaves and then spread to upper leaves. Severe symptoms can progress rapidly, resulting in blighted leaves. The disease can be confused with symptoms of Goss's leaf blight on some hybrids, and perhaps with Stewarts wilt where this disease occurs.",
            how_crop = "Symptoms",
            second_info = "\t The tan lesions of northern corn leaf blight are slender and oblong tapering at the ends ranging in size between 1 to 6 inches.\n" +
                    "\n" +
                    "\t \t \u25CF Lesions run parallel to the leaf margins beginning on the lower leaves and moving up the plant. They may coalesce and cover the enter leaf.\n" +
                    "\n" +
                    "\t \t \u25CF Spores are produced on the underside of the leaf below the lesions giving the appearance of a dusty green fuzz.",
            imp_mngmt = "How to Manage",
            third_info = "\t Northern corn leaf blight can be managed through the use of resistant hybrids.\n" +
                    "\n" +
                    "\t Additionally, timely planting can be useful for avoiding conditions that favor the disease.",
            disease_cycle = R.drawable.cornleafblight
        )
        cropList.add(crop3)

        val crop4 = Crop(
            R.drawable.crop_m,
            crop_disease = "Corn Mildew",
            crop_scientific = "Peronosclerospora philippinensis",
            what_why = "What is Corn Mildew",
            detail_info = "\t Peronosclerospora philippinensis, a causal pathogen of maize downy mildews, is one of the major maize diseases reported in some maize-growing countries, especially in the Philippines. High disease incidence has been reported in many parts in the country specifically in northern Luzon and in many parts of Mindanao despite breakthroughs in controlling or mitigating the disease using cultural and chemical control (Pascual et al., 2005). P. philippinensis is considered the most virulent of the downy mildew pathogens affecting maize, causing substantial losses to crop production (Murray, 2009). Under normal conditions, a 40-60% yield reduction is observed; however, favourable conditions for disease development can amplify these losses to 80-100% (Exconde and Raymundo, 1974). As the pathogen is able to survive in seeds, is able to spread rapidly and occasionally forms resting spores that can survive for more than 1 year, the pathogen has the potential to become a threat to local maize production in warm temperate and tropical areas.\n" +
                    "\n \t Philippine downy mildew, caused by P. philippinensis, is one of the most destructive diseases of maize throughout the world. The pathogen can infect cultivated sugarcane, sorghum and other weed species. The primary source of inoculum is infected hosts such as maize, sugarcane and some susceptible grass species. The introduction risk of this pathogen is intermediate because the conidia are short-lived outside of their host and seeds from affected areas are rarely exported. Dissemination of the pathogen is through water and wind. It can  also be spread through seeds, when the moisture content of the seed is more than 30% (recommended MC:14%), or through infected vegetative material (Murray, 2009; USDA, 2013).",
            how_crop = "Symptoms",
            second_info = "\t P. philippinensis causes a systemic infection wherein intense green and yellow stripes are observed along the entire leaf. Thick, white, woolly growth of conidia and conidiophores can be observed underneath these areas (Gupta and Paul, 2002; Magill et.al., 2006). These symptoms may appear as early as 3 days after infection. As the disease progresses, leaves become narrow and abnormally erect, in some cases, the affected leaves can appear somewhat dried out. Tassels may also exhibit malformation hence, interrupting ear formation and sterility of seed (Magill et al., 2006). Diseased stems do not show external symptoms but are usually stunted.\n" +
                    "\n" +
                    "\t Moderate infection allows the plant to reach maturity but causes small, deformed ears (Weston, 1920; Dalmacio and Raymundo, 1972). In severe cases, infected plants become stunted and weakened, eventually leading to plant death within a month (Murray, 2009).",
            imp_mngmt = "How to Manage",
            third_info = "Prevention\n" +
                    "\n" +
                    "\t Movement of infected planting material is the primary reason for the introduction of a disease into a disease-free environment. Quarantine measures should be strictly enforced to prevent the entry of a disease in an area (Sugar Research Australia, undated). Especially a drying of the seeds to water contents of less than 15% seems to be advisable. However, as a precaution, seeds from areas reporting maize downy mildew should not be imported\n" +
                    "\n" +
                    "Eradication\n" +
                    "\n" +
                    "\t All infected plants should be collected and destroyed by incineration. Monitoring of infected hosts or alternate hosts to ensure that the pathogen would not be able to re-establish is also a must (Murray, 2009). Disposable equipment, infected planting materials and soil should eradicated through autoclaving, high temperature incineration, or deep burial. Double bagging of equipment used in the infested site should also be done (Murray, 2009).\n" +
                    "\n" +
                    "Containment/zoning\n" +
                    "\n" +
                    "\t All infected plants should be eradicated. Any equipment/vehicles used in the infested site should be subjected to movement restrictions. Harvesting of infected crops should not push-through because the dust during harvesting can serve as dispersal agent to neighbouring areas. Clothing and footwear used in the diseased area should be thoroughly disinfected or double bagged preceding disposal. Seeds from the infested site should not be allowed to be used as planting materials, feed for animals or food for consumption (Murray, 2009).\n" +
                    "\n" +
                    "Control\n" +
                    "\n" +
                    "Cultural control and sanitary measures\n" +
                    "\n" +
                    "\t Several cultural methods are used to control downy mildew. One is crop rotation wherein there should be a 15-17 day interval to reduce soil inoculum potential. Another is the removal of any symptomatic plant parts to decrease the inoculum potential of infected plants. Drying of seeds down to its recommended moisture content (14%) also reduces the likelihood of transmission of the pathogen (Murray, 2009).\n" +
                    "\n" +
                    "Physical/mechanical control\n" +
                    "\n" +
                    "\t Reduction of the seed moisture content to less than 14% may lower the risk of seed transmission. Crop rotation between sorghum or maize for more than 3 years is also recommended to reduce soil-borne infection (Murray, 2009).\n" +
                    "\n" +
                    "Chemical control\n" +
                    "\n" +
                    "\t Several fungicides are used for the control and eradication of P. philippinensis. Foliar sprays, soil treatments and seed treatments using protectants or eradicants have been studied. Weston (1923) soaked seeds in 70% alcohol for 30 to 60 seconds and then washed with running water for 1 hour. Exconde (1982) reported metalaxyl to be effective as a seed dressing. Other fungicides such as fentin hydroxide and maneb have also proved to be effective in controlling the disease (Murray, 2009).\n" +
                    "\n" +
                    "Host resistance (incl. vaccination)\n" +
                    "\n" +
                    "\t Philippine downy mildew resistance is determined through multiple gene inheritance and is dictated by additive gene effects (Leon et al., 1993, cited in Murray, 2009). A number of resistant maize varieties have been developed. The majority of the developed lines exhibit slowed systemic infection rates, thereby containing infection to local areas for longer periods of time and lowering overall destructive effects of the disease (Murray, 2009).\n" +
                    "\n" +
                    "\t A study conducted by Pascual et al. (2005) showed that two inbred lines exhibited a high degree of resistance in two separate experimental areas.",
            disease_cycle = R.drawable.mildew
        )
        cropList.add(crop4)

        val crop5 = Crop(
            R.drawable.crop_rbs,
            crop_disease = "Rice Brown Spot",
            crop_scientific = "Cochliobolus miyabeanus",
            what_why = "What is Rice Brown Spot",
            detail_info = "\t Leaf spots are found throughout the season. On young leaves, the spots are smaller than those on older leaves. The spots may vary in size and shape from minute dark spots to large oval to circular spots (Figure 2). The smaller spots are dark brown to reddish-brown. The larger spots have a dark brown margin and a light reddish-brown or gray center with a gold halo. The spots on the leaf sheath and hulls are similar to those on the leaves. The pathogen also attacks the coleoptiles, branches of the panicle, glumes and grains. The fungus causes brown, circular to oval spots on the coleoptile leaves of the seedlings. \n" +
                    "\n \t The disease can develop in areas with high relative humidity (86−100%) and temperature between 16 and 36°C. It is common in unflooded and nutrient-deficient soil, or in soils that accumulate toxic substances. \n" +
                    "\n" +
                    "\t For infection to occur, the leaves must be wet for 8−24 hours.\n" +
                    "\n" +
                    "\t The fungus can survive in the seed for more than four years and can spread from plant to plant through air. Major sources of brown spot in the field include:\n" +
                    "\n" +
                    "\t \t \u25CF infected seed, which give rise to infected seedlings\n" +
                    "\t \t \u25CF volunteer rice\n" +
                    "\t \t \u25CF infected rice debris\n" +
                    "\t \t \u25CF weeds \n" +
                    "\n \t Brown spot can occur at all crop stages, but the infection is most critical during maximum tillering up to the ripening stages of the crop.",
            how_crop = "How to Identify",
            second_info = "Check for lesions:\n" +
                    "\n" +
                    "\t \t \u25CF Infected seedlings have small, circular, yellow brown or brown lesions that may girdle the coleoptile and distort primary and secondary leaves.\n" +
                    "\t \t \u25CF Starting at tillering stage, lesions can be observed on the leaves. They are initially small, circular, and dark brown to purple-brown.\n" +
                    "\t \t \u25CF Fully developed lesions are circular to oval with a light brown to gray center, surrounded by a reddish brown margin caused by the toxin produced by the fungi.\n" +
                    "\n \t On susceptible varieties, lesions are 5−14 mm long which can cause leaves to wilt. On resistant varieties, the lesions are brown and pinhead-sized.\n" +
                    "\t Lesions on leaf sheaths are similar to those on the leaves. Infected glumes and panicle branches have dark brown to black oval spots or discoloration on the entire surface.\n" +
                    "\n" +
                    "\t Spikelets can also be infected. Infection of florets leads to incomplete or disrupted grain filling and a reduction in grain quality. The disease-causing fungi can also penetrate grains, causing 'pecky rice', a term used to describe spotting and discoloration of grains.\n" +
                    "\n" +
                    "\t In certain rice varieties, brown spot lesions can be mistaken for blast lesions. To confirm, check if spots are circular, brownish, and have a gray center surrounded by a reddish margin.",
            imp_mngmt = "How to Manage",
            third_info = "\t Improving soil fertility is the first step in managing brown spot. To do this:\n" +
                    "\n" +
                    "\t \t \u25CF monitor soil nutrients regularly\n" +
                    "\t \t \u25CF apply required fertilizers\n" +
                    "\t \t \u25CF for soils that are low in silicon, apply calcium silicate slag before planting\n" +
                    "\t Fertilizers, however, can be costly and may take many cropping seasons before becoming effective. More economical management options include:\n" +
                    "\n" +
                    "\t \t \u25CF Use resistant varieties. \n" +
                    "\t \t \u25CF Contact your local agriculture office for up-to-date lists of varieties available.\n" +
                    "\t \t \u25CF Use fungicides (e.g., iprodione, propiconazole, azoxystrobin, trifloxystrobin, and carbendazim) as seed treatments.\n" +
                    "\t \t \u25CF Treat seeds with hot water (53−54°C) for 10−12 minutes before planting, to control primary infection at the seedling stage. To increase effectiveness of treatment, pre-soak seeds in cold water for eight hours.",
            disease_cycle = R.drawable.brown_spot
        )
        cropList.add(crop5)

        val crop6 = Crop(
            R.drawable.crop_rb,
            crop_disease = "Rice Leaf Blast",
            crop_scientific = "Magnaporthe oryzae",
            what_why = "What is Rice Leaf Blast",
            detail_info = "\t Blast is caused by the fungus Magnaporthe oryzae. It can affect all above ground parts of a rice plant: leaf, collar, node, neck, parts of panicle, and sometimes leaf sheath.It occurs in areas with low soil moisture, frequent and prolonged periods of rain shower, and cool temperature in the daytime. In upland rice, large day-night temperature differences that cause dew formation on leaves and overall cooler temperatures favor the development of the disease. Rice can have blast in all growth stages. However, leaf blast incidence tends to lessen as plants mature and develop adult plant resistance to the disease. Blast can occur wherever blast spores are present.\n" +
                    "\n" +
                    "\t It occurs in areas with low soil moisture, frequent and prolonged periods of rain shower, and cool temperature in the daytime. In upland rice, large day-night temperature differences that cause dew formation on leaves and overall cooler temperatures favor the development of the disease.\n" +
                    "\n" +
                    "\t Rice can have blast in all growth stages. However, leaf blast incidence tends to lessen as plants mature and develop adult plant resistance to the disease.",
            how_crop = "How to Identify",
            second_info = "\t Check the leaf and collar for lesions:\n" +
                    "\n" +
                    "\t \t \u25CF Initial symptoms appear as white to gray-green lesions or spots, with dark green borders.\n" +
                    "\t \t \u25CF Older lesions on the leaves are elliptical or spindle-shaped and whitish to gray centers with red to brownish or necrotic border.\n" +
                    "\n \t Check for other symptoms:\n" +
                    "\n" +
                    "\t \t \u25CF Some resemble diamond shape, wide in the center and pointed toward either ends.\n" +
                    "\t \t \u25CF Lesions can enlarge and coalesce, growing together, to kill the entire leaves.",
            imp_mngmt = "How to Manage",
            third_info = "\t Rice blast is one of the most destructive diseases of rice. A leaf blast infection can kill seedlings or plants up to the tillering stage. At later growth stages, a severe leaf blast infection reduces leaf area for grain fill, reducing grain yield.\n" +
                    "\n" +
                    "\t Leaf blast can kill rice plants at seedling stage and cause yield losses in cases of severe infection.The primary control option for blast is to plant resistant varieties. Contact your local agriculture office for up-to-date lists of varieties available.\n" +
                    "\n" +
                    "\t Other crop management measures can also be done, such as:\n" +
                    "\n" +
                    "\t \t \u25CF Adjust planting time. Sow seeds early, when possible, after the onset of the rainy season.\n" +
                    "\t \t \u25CF Split nitrogen fertilizer application in two or more treatments. Excessive use of fertilizer can increase blast intensity.\n" +
                    "\t \t \u25CF Flood the field as often as possible.\n" +
                    "\t \t \u25CF Silicon fertilizers (e.g., calcium silicate) can be applied to soils that are silicon deficient to reduce blast. However, because of its high cost, silicon should be applied efficiently.\n " +
                    "\t \t \u25CF Cheap sources of silicon, such as straws of rice genotypes with high silicon content, can be an alternative. \n"+
                    "\t \t \u25CF Care should be taken to ensure that the straw is free from blast as the fungus can survive on rice straw and the use of infected straw as a silicon source can spread the disease further.\n" +
                    "\n" +
                    "\t Systemic fungicides like triazoles and strobilurins can be used judiciously for control to control blast. A fungicide application at heading can be effective in controlling the disease.",
            disease_cycle = R.drawable.blast
        )
        cropList.add(crop6)

        val crop7 = Crop(
            R.drawable.crop_rlb,
            crop_disease = "Rice Leaf Blight",
            crop_scientific = "Xanthomonas oryzae",
            what_why = "What is Rice Leaf Blight",
            detail_info = "\t Rice leaf blight, or sometimes known as rice bacterial blight, also called bacterial blight of rice, deadly bacterial disease that is among the most destructive afflictions of cultivated rice (Oryza sativa and O. glaberrima). In severe epidemics, crop loss may be as high as 75 percent, and millions of hectares of rice are infected annually. The disease was first observed in 1884–85 in Kyushu, Japan, and the causal agent, the bacterium Xanthomonas oryzae pathovar oryzae (also referred to as Xoo), was identified in 1911, at that time having been named Bacillus oryzae. Thriving in warm, humid environments, bacterial blight has been observed in rice-growing regions of Asia, the western coast of Africa, Australia, Latin America, and the Caribbean. Although not commonly found in the United States, a bacterial strain related to Xoo has been listed as an agricultural select agent by the U.S. Department of Agriculture, a designation that places it under strict regulations.\n" +
                    "\t The disease is most likely to develop in areas that have weeds and stubbles of infected plants. It can occur in both tropical and temperate environments, particularly in irrigated and rainfed lowland areas. In general, the disease favors temperatures at 25−34°C, with relative humidity above 70%.\n" +
                    "\n" +
                    "\t It is commonly observed when strong winds and continuous heavy rains occur, allowing the disease-causing bacteria to easily spread through ooze droplets on lesions of infected plants.\n" +
                    "\n" +
                    "\t Bacterial blight can be severe in susceptible rice varieties under high nitrogen fertilization.",
            how_crop = "How to Identify",
            second_info = "\t Check for wilting and yellowing of leaves, or wilting of seedlings (also called kresek).\n" +
                    "\n" +
                    "\t On seedlings, infected leaves turn grayish green and roll up. As the disease progresses, the leaves turn yellow to straw-colored and wilt, leading whole seedlings to dry up and die.\n" +
                    "\n" +
                    "\t Kresek on seedlings may sometimes be confused with early rice stem borer damage. \n" +
                    "\n" +
                    "\t To distinguish kresek symptoms from stem borer damage, squeeze the lower end of infected seedlings between the fingers. Kresek symptoms should show yellowish bacterial ooze coming out of the cut ends. Unlike plants infested with stem borer, rice plants with kresek are not easily pulled out from soil.\n" +
                    "\n \t Check for lesions:\n" +
                    "\n" +
                    "\t \t \u25CF On older plants, lesions usually develop as water-soaked to yellow-orange stripes on leaf blades or leaf tips or on mechanically injured parts of leaves. Lesions have a wavy margin and progress toward the leaf base.\n" +
                    "\t \t \u25CF On young lesions, bacterial ooze resembling a milky dew drop can be observed early in the morning. The bacterial ooze later on dries up and becomes small yellowish beads underneath the leaf.\n" +
                    "\t \t \u25CF Old lesions turn yellow to grayish white with black dots due to the growth of various saprophytic fungi. On severely infected leaves, lesions may extend to the leaf sheath.\n" +
                    "\n \t To quickly diagnose bacterial blight on leaf:\n" +
                    "\n" +
                    "\t \t \u25CF cut a young lesion across and place in a transparent glass container with clear water\n" +
                    "\t \t \u25CF after a few minutes, hold the container against light and observe for thick or turbid liquid coming from the cut end of the leaf",
            imp_mngmt = "How to Manage",
            third_info = "\t Planting resistant varieties has been proven to be the most efficient, most reliable, and cheapest way to control bacterial blight.\n" +
                    "\n" +
                    "\t Other disease control options include:\n" +
                    "\n" +
                    "\t \t \u25CF Use balanced amounts of plant nutrients, especially nitrogen.\n" +
                    "\t \t \u25CF Ensure good drainage of fields (in conventionally flooded crops) and nurseries.\n" +
                    "\t \t \u25CF Keep fields clean. Remove weed hosts and plow under rice stubble, straw, rice ratoons and volunteer seedlings, which can serve as hosts of bacteria.\n" +
                    "\t \t \u25CF Allow fallow fields to dry in order to suppress disease agents in the soil and plant residues.",
            disease_cycle = R.drawable.bacterial_leaf_blight
        )
        cropList.add(crop7)

        val crop8 = Crop(
            R.drawable.crop_t,
            crop_disease = "Rice Tungro",
            crop_scientific = "Rice tungro bacilliform virus",
            what_why = "What is Rice Tungro",
            detail_info = "\t Rice tungro disease is caused by the combination of two viruses, which are transmitted by leafhoppers. It causes leaf discoloration, stunted growth, reduced tiller numbers and sterile or partly filled grains. Tungro infects cultivated rice, some wild rice relatives and other grassy weeds commonly found in rice paddies. Tungro disease viruses are transmitted from one plant to another by leafhoppers that feed on tungro-infected plants. The most efficient vector is the green leafhopper.\n" +
                    "\n" +
                    "\t Leafhoppers can acquire the viruses from any part of the infected plant by feeding on it, even for a short time. It can, then, immediately transmit the viruses to other plants within 5−7 days. The viruses do not remain in the leafhopper's body unless it feeds again on an infected plant and re-acquires the viruses.\n" +
                    "\n" +
                    "\t Tungro infection can occur during all growth stages of the rice plant. It is most frequently seen during the vegetative phase. Plants are most vulnerable at tillering stage.\n" +
                    "\n" +
                    "\t Tungro incidence depends on the availability of the virus sources and vector population. Other than infected rice plants in the farmer's field, other primary sources for tungro, include:\n" +
                    "\n" +
                    "\t \t \u25CF stubble of previous crops\n" +
                    "\t \t \u25CF new growth from infected stubbles that had not been properly plowed under and harrowed effectively\n" +
                    "\t \t \u25CF volunteer rice\n" +
                    "\t \t \u25CF infected plants in nearby rice fields\n" +
                    "\n \t Seedlings raised in nurseries or seedbeds can also be infected with Tungro prior to transplanting and can be a primary source of virus.\n" +
                    "\n" +
                    "\t Transplanting seedlings from nurseries in tungro-infected areas has also shown to increase infection rates in the field, particularly, in cases where seedbed is in a tungro-endemic area or when the nursery duration is 5−6 weeks.\n" +
                    "\n" +
                    "\t However, this is not believed to be a very strong mechanism in initiating epidemics, because the competitiveness of tungro-infected seedlings is low; they can die rapidly after transplanting.",
            how_crop = "How to Identify",
            second_info = "\t \t \u25CF Check for presence of leafhoppers.\n" +
                    "\n" +
                    "\t \t \u25CF Check leaves for discoloration.\n" +
                    "\n" +
                    "\t Yellow or orange-yellow discoloration is noticeable in tungro-infected plants. Discoloration begins from the leaf tip and extends down to the blade or the lower leaf portion. Infected leaves may also show mottled or striped appearance, rust-colored spots, and inter-veinal necrosis.\n" +
                    "\n \t Tungro-infected plants also show symptoms of stunting, delayed flowering which may delay maturity, reduced number of tillers, small and not completely exserted panicles, as well as a higher than normal percentage of sterile panicles or partially filled grains, covered with dark brown blotches.\n" +
                    "\n" +
                    "\t The degree of stunting and of leaf discoloration varies with rice varieties, strains of the viruses, the age of the plant when infected, and with the environment. In varieties that carry some resistance to the disease, infected plants exhibit no discoloration or only a mild discoloration that may disappear as the plants mature. \n" +
                    "\n" +
                    "\t Tungro symptoms can be mistaken for physiological disorders.Specifically,\n" +
                    "\n" +
                    "\t \t \u25CF the yellowing of the plant and its stunted height can be confused as nitrogen and zinc deficiencies and water stress,\n" +
                    "\t \t \u25CF pest infestation such as stem borer infestation, plant hopper infestation, and rat damage, and\n" +
                    "\t \t \u25CF other diseases such as grassy stunt virus disease and orange leaf.\n" +
                    "\n \t Where available, Tungro can be confirmed using serological tools such as Latex agglutination test, Enzyme Linked Immunosorbent Assays (ELISA) and Rapid Immunofilter Paper Assays (RIPA).",
            imp_mngmt = "How to Manage",
            third_info = "\t Once a rice plant is infected by tungro, it cannot be cured.\n" +
                    "\n" +
                    "\t Preventive measures are more effective for the control of tungro than direct disease control measures. Using insecticides to control leafhoppers is often not effective, because green leafhoppers continuously move to surrounding fields and spread tungro rapidly in very short feeding times.\n" +
                    "\n" +
                    "\t The most practical measures at present, include\n" +
                    "\n" +
                    "\t \t \u25CF Grow tungro or leafhopper resistant varieties.\n" +
                    "\t \t \u25CF This is the most economical means of managing the disease. There are tungro-resistant varieties available for the Philippines, Malaysia, Indonesia, India, and Bangladesh.\n" +
                    "\t \t \u25CF Contact your local agriculture office for up-to-date lists of varieties available.\n" +
                    "\t \t \u25CF Practice synchronous planting with surrounding farms.\n" +
                    "\t \t \u25CF Delayed or late planting, relative to the average date in a given area, makes the field susceptible for Tungro. Late-planted fields also pose a risk to early planting in the next season.\n" +
                    "\t \t \u25CF Adjust planting times to when green leafhopper are not in season or abundant, if known\n" +
                    "\t \t \u25CF Plow infected stubbles immediately after harvest to reduce inoculum sources and destroy the eggs and breeding sites of green leaf hopper.",
            disease_cycle = R.drawable.tungro_disease_cycle
        )
        cropList.add(crop8)
    }

}