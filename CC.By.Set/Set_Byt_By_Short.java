package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_Short;
import CC.Util.By.LMNt.Set_Byt_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Short;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q$Q.Short$Byt;
import CC.$.Q2$.Short_Byt$;
import CC.$.Q_Q$Q.Byt2$1;

public interface Set_Byt_By_Short<From_Typ> extends
	Get_Byt_By_Short,
	Set_Byt_By_Q<From_Typ>,
	Set_Q_By_Short<From_Typ>,
	Short_Byt$
{
	@Lin_Dclar void Set_Byt_By_Short(short By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_Byt$(short By,byte Valu){Set_Byt_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_Short_Sorc(short By,Short$Byt Sorc){Set_Byt_By_Short(By,Sorc.Short$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_Short(short By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_Short(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_Short_Sorc(short By,Byt$Byt Fun,Short$Byt Sorc)
			{Set_Byt1$1_By_Short(By,Fun,Sorc.Short$Byt(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt1$1_By_Short(short By,Byt$Byt Fun)
				{Set_Byt1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_Short(short By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_Short(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_Short_SLit(short By,Byt2$1 Fun,Short$Byt A,byte B)
			{Set_Byt2$1_By_Short(By,Fun,A.Short$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_Short(short By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_Short_Sorc(short By,Byt2$1 Fun,Short$Byt A,Short$Byt B)
				{Set_Byt2$1_By_Short_SLit(By,Fun,A,B.Short$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_Short_Sorc(short By,Byt2$1 Fun,Short$Byt B)
					{Set_Byt2$1_By_Short_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_Short(short By,byte Valu)
	{
		byte Stor=Get_Byt_By_Short(By);
		Set_Byt_By_Short(By,Valu);

		return Stor;
	}
}