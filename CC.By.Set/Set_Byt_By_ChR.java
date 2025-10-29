package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_ChR;
import CC.Util.By.Set_Q_By_Q;
import CC.$.Q$Q.Bool$Byt;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q$Q.ChR$Byt;
import CC.$.Q2$.ChR_Byt$;
import CC.$.Q_Q$Q.Byt2$1;

public interface Set_Byt_By_ChR<From_Typ> extends
	Get_Byt_By_ChR,
	Set_Q_By_Q<From_Typ>,
	ChR_Byt$
{
	@Lin_Dclar void Set_Byt_By_ChR(char By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void ChR_Byt$(char By,byte Valu){Set_Byt_By_ChR(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_ChR_Sorc(char By,ChR$Byt Sorc){Set_Byt_By_ChR(By,Sorc.ChR$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_ChR(char By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_ChR(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_ChR_Sorc(char By,Byt$Byt Fun,ChR$Byt Sorc)
			{Set_Byt1$1_By_ChR(By,Fun,Sorc.ChR$Byt(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt1$1_By_ChR(char By,Byt$Byt Fun)
				{Set_Byt1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_ChR(char By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_ChR(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_ChR_SLit(char By,Byt2$1 Fun,ChR$Byt A,byte B)
			{Set_Byt2$1_By_ChR(By,Fun,A.ChR$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_ChR(char By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_ChR_Sorc(char By,Byt2$1 Fun,ChR$Byt A,ChR$Byt B)
				{Set_Byt2$1_By_ChR_SLit(By,Fun,A,B.ChR$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_ChR_Sorc(char By,Byt2$1 Fun,ChR$Byt B)
					{Set_Byt2$1_By_ChR_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_ChR(char By,byte Valu)
	{
		byte Stor=Get_Byt_By_ChR(By);
		Set_Byt_By_ChR(By,Valu);

		return Stor;
	}
}