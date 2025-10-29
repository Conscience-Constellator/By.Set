package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Flot_By_ChR;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_ChR;
import CC.$.Q$Q.ChR$Flot;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q2$.ChR_Flot$;
import CC.$.Q_Q$Q.Flot2$1;

public interface Set_Flot_By_ChR<From_Typ> extends
	Get_Flot_By_ChR,
	Set_Flot_By_Q<From_Typ>,
	Set_Q_By_ChR<From_Typ>,
	ChR_Flot$
{
	@Lin_Dclar
	void Set_Flot_By_ChR(char By,float Valu);
	@Override @Neds_Ovrid(NEds=No)
	default void ChR_Flot$(char By,float Valu)
	{Set_Flot_By_ChR(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_ChR_Sorc(char By,ChR$Flot Sorc)
		{Set_Flot_By_ChR(By,Sorc.ChR$Flot(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_ChR(char By,Flot1$1 Fun,float Valu)
		{Set_Flot_By_ChR(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_ChR_Sorc(char By,Flot1$1 Fun,ChR$Flot Sorc)
			{Set_Flot1$1_By_ChR(By,Fun,Sorc.ChR$Flot(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_ChR(char By,Flot1$1 Fun)
				{Set_Flot1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_ChR(char By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_ChR(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_ChR_SLit(char By,Flot2$1 Fun,ChR$Flot A,float B)
			{Set_Flot2$1_By_ChR(By,Fun,A.ChR$Flot(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_ChR(char By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_ChR_Sorc(char By,Flot2$1 Fun,ChR$Flot A,ChR$Flot B)
				{Set_Flot2$1_By_ChR_SLit(By,Fun,A,B.ChR$Flot(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_ChR_Sorc(char By,Flot2$1 Fun,ChR$Flot B)
					{Set_Flot2$1_By_ChR_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_ChR(char By,float Valu)
	{
		float Stor=Get_Flot_By_ChR(By);
		Set_Flot_By_ChR(By,Valu);

		return Stor;
	}
}