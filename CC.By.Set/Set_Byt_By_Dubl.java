package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_Dubl;
import CC.Util.By.Set_Q_By_Q;
import CC.$.Q$Q.Bool$Byt;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q$Q.Dubl$Byt;
import CC.$.Q2$.Dubl_Byt$;
import CC.$.Q_Q$Q.Byt2$1;

public interface Set_Byt_By_Dubl<From_Typ> extends
	Get_Byt_By_Dubl,
	Set_Q_By_Q<From_Typ>,
	Dubl_Byt$
{
	@Lin_Dclar void Set_Byt_By_Dubl(double By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Dubl_Byt$(double By,byte Valu){Set_Byt_By_Dubl(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_Dubl_Sorc(double By,Dubl$Byt Sorc){Set_Byt_By_Dubl(By,Sorc.Dubl$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_Dubl(double By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_Dubl(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_Dubl_Sorc(double By,Byt$Byt Fun,Dubl$Byt Sorc)
			{Set_Byt1$1_By_Dubl(By,Fun,Sorc.Dubl$Byt(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt1$1_By_Dubl(double By,Byt$Byt Fun)
				{Set_Byt1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_Dubl(double By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_Dubl(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_Dubl_SLit(double By,Byt2$1 Fun,Dubl$Byt A,byte B)
			{Set_Byt2$1_By_Dubl(By,Fun,A.Dubl$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_Bool(double By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_Dubl_Sorc(double By,Byt2$1 Fun,Dubl$Byt A,Dubl$Byt B)
				{Set_Byt2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_Dubl_Sorc(double By,Byt2$1 Fun,Dubl$Byt B)
					{Set_Byt2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_Dubl(double By,byte Valu)
	{
		byte Stor=Get_Byt_By_Dubl(By);
		Set_Byt_By_Dubl(By,Valu);

		return Stor;
	}
}