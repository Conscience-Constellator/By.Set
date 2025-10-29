package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_Short;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Short;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q$Q.Short$Dubl;
import CC.$.Q2$.Short_Dubl$;
import CC.$.Q_Q$Q.Dubl2$1;

public interface Set_Dubl_By_Short<From_Typ> extends
	Get_Dubl_By_Short,
	Set_Dubl_By_Q<From_Typ>,
	Set_Q_By_Short<From_Typ>,
	Short_Dubl$
{
	@Lin_Dclar void Set_Dubl_By_Short(short By,double Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_Dubl$(short By,double Valu){Set_Dubl_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl_By_Short_Sorc(short By,Short$Dubl Sorc){Set_Dubl_By_Short(By,Sorc.Short$Dubl(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl1$1_By_Short(short By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_Short(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl1$1_By_Short_Sorc(short By,Dubl1$1 Fun,Short$Dubl Sorc)
			{Set_Dubl1$1_By_Short(By,Fun,Sorc.Short$Dubl(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl1$1_By_Short(short By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl2$1_By_Short(short By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_Short(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl2$1_By_Short_SLit(short By,Dubl2$1 Fun,Short$Dubl A,double B)
			{Set_Dubl2$1_By_Short(By,Fun,A.Short$Dubl(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl2$1_By_Short(short By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Dubl2$1_By_Short_Sorc(short By,Dubl2$1 Fun,Short$Dubl A,Short$Dubl B)
				{Set_Dubl2$1_By_Short_SLit(By,Fun,A,B.Short$Dubl(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Dubl2$1_By_Short_Sorc(short By,Dubl2$1 Fun,Short$Dubl B)
					{Set_Dubl2$1_By_Short_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default double SGet_Dubl_By_Short(short By,double Valu)
	{
		double Stor=Get_Dubl_By_Short(By);
		Set_Dubl_By_Short(By,Valu);

		return Stor;
	}
}