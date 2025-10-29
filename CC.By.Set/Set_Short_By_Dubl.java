package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_Dubl;
import CC.Util.By.LMNt.Set_Q_By_Dubl;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Dubl$Short;
import CC.$.Q$Q.Short1$1;
import CC.$.Q2$.Dubl_Short$;
import CC.$.Q_Q$Q.Short2$1;

public interface Set_Short_By_Dubl<From_Typ> extends
	Get_Short_By_Dubl,
	Set_Q_By_Dubl<From_Typ>,
	Set_Short_By_Q<From_Typ>,
	Dubl_Short$
{
	@Lin_Dclar void Set_Short_By_Dubl(double By,short Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Dubl_Short$(double By,short Valu){Set_Short_By_Dubl(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short_By_Dubl_Sorc(double By,Dubl$Short Sorc){Set_Short_By_Dubl(By,Sorc.Dubl$Short(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short1$1_By_Dubl(double By,Short1$1 Fun,short Valu)
		{Set_Short_By_Dubl(By,Fun.Short1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short1$1_By_Dubl_Sorc(double By,Short1$1 Fun,Dubl$Short Sorc)
			{Set_Short1$1_By_Dubl(By,Fun,Sorc.Dubl$Short(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short1$1_By_Dubl(double By,Short1$1 Fun)
				{Set_Short1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Short2$1_By_Dubl(double By,Short2$1 Fun,short A,short B)
		{Set_Short_By_Dubl(By,Fun.Short2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Short2$1_By_Dubl_SLit(double By,Short2$1 Fun,Dubl$Short A,short B)
			{Set_Short2$1_By_Dubl(By,Fun,A.Dubl$Short(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Short2$1_By_Dubl(double By,Short2$1 Fun,short B)
				{Set_Short2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Short2$1_By_Dubl_Sorc(double By,Short2$1 Fun,Dubl$Short A,Dubl$Short B)
				{Set_Short2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$Short(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Short2$1_By_Dubl_Sorc(double By,Short2$1 Fun,Dubl$Short B)
					{Set_Short2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default short SGet_Short_By_Dubl(double By,short Valu)
	{
		short Stor=Get_Short_By_Dubl(By);
		Set_Short_By_Dubl(By,Valu);

		return Stor;
	}
}